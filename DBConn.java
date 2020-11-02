import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn {

	public static Connection getConnection() {
		Connection connection=null;
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver()); //loading the driver.
			connection = DriverManager.getConnection("jdbc:derby://localhost:1527/TestDB2");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;	
	}
	
}
