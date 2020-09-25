package com.hsbc.db;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTransEx {
	
	static Connection conn =null;
	public DBTransEx() {
		// TODO Auto-generated constructor stub
		conn= DBConnection.getConnection();
	}
	
	public static void main(String[] args) {
		try {
			DBTransEx tr = new DBTransEx();
			Statement stmt = conn.createStatement();
//			conn.setAutoCommit(false);
//			stmt.executeUpdate("insert into emp values (800,'ffs',8000)");
//			stmt.executeUpdate("insert into emp values (900,'vzv',3000)");
//			conn.commit();
			ResultSet rs= stmt.executeQuery("select * from emp");
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println(rsmd.getColumnCount());
			System.out.println(rsmd.getColumnLabel(1));
			
			DatabaseMetaData dbmd = conn.getMetaData();
			System.out.println(dbmd.getDatabaseMajorVersion());
			System.out.println(dbmd.getDatabaseProductName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
	}
}
