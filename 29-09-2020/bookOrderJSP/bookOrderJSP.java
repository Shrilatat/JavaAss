package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class bookOrderJSP {
	static Connection conn = null;
	static PreparedStatement myStmt = null;
	static ResultSet myRs = null;

	public static void connect() {
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/testdb");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ArrayList<String> returnBook(String author) throws SQLException {
		connect();
		myStmt = conn.prepareStatement("SELECT * FROM BOOKS WHERE BOOKAUTHOR = ?");
		myStmt.setString(1, author);
		myRs = myStmt.executeQuery();
		ArrayList<String> answer = new ArrayList<>();
		while(myRs.next()) {
			answer.add(myRs.getString(1));
		}
		return answer;
	}
}
