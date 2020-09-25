package com.hsbc.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemo {

	public static void main(String[] args) {
		
		String sql="insert into emp values(999,'Pooja',5000)";
		
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
			//Class.forName.......
			
			Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527//TestDB1");
			System.out.println(conn);
			
			Statement stmt=conn.createStatement();
			stmt.executeUpdate(sql); //DML
			//stmt.executeQuery("select * from emp"); //DDL
			
			ResultSet rs=stmt.executeQuery("select * from emp");
			
			while(rs.next()) {   //fetch next record until there are records in DB
			
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
			System.out.println("--------------------------------");
			}
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}
