package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DataAccessObject {
	static Connection conn = null;
	
	public void connect(){
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/loginDB");
			System.out.println("Conn in connect() is :"+conn);
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
	
	public boolean sendCredentials(String username, String password) throws SQLException {
		connect();
		String usernameFromDB = null;
		String passwordFromDB = null;
		Statement statement = conn.createStatement();
		String myQuery = "SELECT * FROM USERS";
		ResultSet resultSet = statement.executeQuery(myQuery);
		while (resultSet.next()) {
			usernameFromDB = resultSet.getString(1);
			passwordFromDB = resultSet.getString(2);
		}
		if (username.equals(usernameFromDB) && password.equals(passwordFromDB)) {
			return true;
		}
		return false;
	}
}
