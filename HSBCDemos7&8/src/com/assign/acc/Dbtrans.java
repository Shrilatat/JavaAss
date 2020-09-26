package com.assign.acc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Dbtrans {
	
	static Connection conn = DBConnection.getConnection();;
	public static void main(String[] args) throws SQLException {
	
		
		Statement stmt = conn.createStatement();
		try {
			
			conn.setAutoCommit(false);
			stmt.executeUpdate("insert into emp values(800 , 'ggg' , 3000)");
			stmt.executeUpdate("insert into emp values(900 , 'hhh' , 4000)");
			conn.commit();
		}
		
		catch (SQLException e) {
			conn.rollback();
		}
	}

}
