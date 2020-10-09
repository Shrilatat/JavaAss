package com.trg;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemoDao2 {

	Connection conn=null;
	
	public DBDemoDao2() {
		conn= DBConnection.getConnection();
	}
	
	
	 public String Validation(String username) throws SQLException  {
		
	 
		String sql="Select * from use where userName= '"+username+"'";
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
	     rs.next();
	     return rs.getString(2);
	} 
	 }



