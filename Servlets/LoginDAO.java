package com.hsbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO {
	Connection conn=null;
	
	public LoginDAO()
	{
		conn=DBConnection.getConnection();
	}
	
	boolean verify(String name, String pass) throws SQLException{
		Statement stmt=conn.createStatement();
		
		ResultSet res=stmt.executeQuery("select * from log");
		
		res.next();
		//System.out.println(res.getString(1));
		//System.out.println(res.getString(2));
		
		if(name.equals(res.getString(1)) && pass.equals(res.getString(2)))
		{
			System.out.println("Yes");
			return true;
		}
		else {
			System.out.println("No");
			return false;
		}
	}
}
