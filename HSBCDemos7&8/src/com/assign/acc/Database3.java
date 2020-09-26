package com.assign.acc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database3 {
	
	static Connection conn = DBConnection.getConnection();

public static void main(String[] args) throws SQLException  {
		 Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE , ResultSet.CONCUR_READ_ONLY);
		 ResultSet rs = stmt.executeQuery("Select * from emp");
		 
		 while(rs.next())
		 {
			 System.out.println(rs.getString(1) + ":" + rs.getString(2) + ":" + rs.getString(1) );
		 }
		 System.out.println("-----------------------");
		 rs.first();
		 System.out.println(rs.getString(1) + ":" + rs.getString(2) + ":" + rs.getString(1) );
		 
		 System.out.println("-----------------------");
		 rs.last();
		 System.out.println(rs.getString(1) + ":" + rs.getString(2) + ":" + rs.getString(1) );
		 
		 System.out.println("-----------------------");
		 rs.previous();
		 System.out.println(rs.getString(1) + ":" + rs.getString(2) + ":" + rs.getString(1) );
		 
	}


}

