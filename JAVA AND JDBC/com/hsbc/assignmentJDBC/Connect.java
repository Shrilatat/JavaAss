package com.hsbc.assignmentJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	static Connection conn = null;

	public static Connection connect() {
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());

			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/TestDB2");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return conn;
	}
}
