package com.hsbc;
import java.sql.*;

public class DbConnection {
	
	static Connection conn=null;
	
	public static Connection getConnection() {
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
			 conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Order");	
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
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
