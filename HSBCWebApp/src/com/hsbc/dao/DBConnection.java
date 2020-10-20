package com.hsbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static Connection conn = null;
	
	public static Connection getConnection() {
		
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/LoginDB");
		
		}catch(SQLException e) {
			e.getMessage();
		}
			return conn;
	}
}
