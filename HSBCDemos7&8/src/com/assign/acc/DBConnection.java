package com.assign.acc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	static Connection conn = null;
	public static Connection getConnection()
	{
		
		
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
			//Class.forName("org.apache.derby.jdbc.ClientDriver");
			
			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/TestDB3");
			System.out.println(conn);
			
			
		} 
		
		catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
		
		return conn;
	}
	
	public static void closeConnection()
	{
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
