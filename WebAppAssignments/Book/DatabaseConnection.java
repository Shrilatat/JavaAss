package com.trg.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	static Connection conn = null;
	
	public static Connection getConnection() {
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/UDB");
			System.out.println(conn.hashCode());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
		
	}
	
	public static void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
