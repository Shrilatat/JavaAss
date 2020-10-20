package com.assign.acc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

public static void main(String[] args) {
		
		String sql = "insert into emp values(999,'Aditi' , 1000)";
		String sql1 = "delete from emp where empid >102";
	
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
			//Class.forName("org.apache.derby.jdbc.ClientDriver");
			
			Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/TestDB3");
			System.out.println(conn);
			
			Statement stmt = conn.createStatement();
			
			//int count = stmt.executeUpdate(sql);
			/*if(count > 0)
				System.out.println("Connection successful");
			System.out.println("Rows affected : " + count);*/
			ResultSet rs = stmt.executeQuery("select * from emp");
			
			while(rs.next())
			{
			System.out.println(rs.getInt(1) + "  : " + rs.getString(2)+ " : "+ rs.getInt(3) );//retrieves data of first row first column from result set
			//System.out.println();//retrieves data of first row second column from result set
			//System.out.println();
			System.out.println("----------------------");
			}
		} 
		
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
