package com.hsbc.DB;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemo1 {

	static Connection conn=DBConnection.getConnection();
	
	public static void main(String[] args) {
		
		Statement stmt;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//transaction management
		
		ResultSet rs=stmt.executeQuery("select empid from emp");
		ResultSetMetaData rsmd=rs.getMetaData(); //meta data
		//similarly get column count, get column label and so on.
		
		try {
			DatabaseMetaData dbmd=conn.getMetaData();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
		try {
		conn.setAutoCommit(false);
		stmt.executeUpdate("insert into emp values(800,'yu',3000)");
		stmt.executeUpdate("insert into emp values(800,'yu',3000)");
		conn.commit();
		}
		catch(Exception e)
		{
			conn.rollback();
		}
}}