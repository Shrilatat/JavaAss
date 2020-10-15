package com.hsbc.servletdemo.ex1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class LoginDao {
	Connection conn=null;

	public LoginDao() {
		conn=DBConnection.getConnection();
	}
	
	boolean verifyData(String name,String pass) throws SQLException {
		Statement stmt=conn.createStatement();
		
		
		ResultSet rs=stmt.executeQuery("select * from log");
		
		rs.next();
		System.out.println(rs.getString(1));
		System.out.println(rs.getString(2));
		System.out.println(name);
		System.out.println(pass);
		if(name.equals(rs.getString(1)) && pass.equals(rs.getString(2))) {
			System.out.println("yes");
			return true;
		}
		else 
		{
			System.out.println("Falsee");
			return false;
		}
			
		
	}
	

}
