package com.hsbc.database;

import java.sql.*;


public class LoginDao {
	Connection conn=null;
	
	public LoginDao() {
		conn= DBConnection.getConnection();
	}
	
	public boolean verifyData(String name, String pass) throws SQLException
	{
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("select * from login");
			
			rs.next();
			System.out.println(rs.getString(name));
			
			if(name.equals(rs.getString(1)) && pass.equals(rs.getString(2)) )
			{
				System.out.println("correct");
				return true;
			}
			else
				return false;
	}
}
