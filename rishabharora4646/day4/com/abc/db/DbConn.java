package com.abc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConn {
	public static Connection getConnection() {
		Connection conn=null;
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver()); //loading the driver.
			conn = DriverManager.getConnection("jdbc:derby://localhost:1527/TestDB2");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;	
	}
}
