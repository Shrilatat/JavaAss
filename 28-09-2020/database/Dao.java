package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dao {
	Connection conn = null;

	public void connectToDB() {
		this.conn = DBConnection.getConnection();
		System.out.println("The connection is :" +conn);
	}

	public void disconnectFromDB() {
		DBConnection.closeConnection();
	}

	public boolean sendCredentials(String username, String password) throws SQLException {
		connectToDB();
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
