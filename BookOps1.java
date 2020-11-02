
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class BookOps {
	
	Statement statement=null;
	Connection connection=null;
	
	
	
	try {
		DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
		connection = DriverManager.getConnection("jdbc:derby://localhost:1527/TestDB2\r\n");
		statement = connection.createStatement();		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	public void addBook(Book b) {
	
		try {
			String sql = "INSERT INTO books VALUES("+b.getBookNo()+",'"+b.getBname()+"','"+b.getAuth()+"',"+b.getPrice()+")";
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}		
	}
	
	
	public void deleteBook(int id) {

		try {
		
			String sql = "DELETE FROM books WHERE bookid="+id;
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}	
	}

	public void updateBook(int id,double price) {
	
		try {
		
			String sql = "UPDATE books SET price="+price+" WHERE bookid="+id;
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}	
	}

	

	}

}
