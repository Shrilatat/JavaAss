package com.hsbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginDatabaseDao {

	public boolean validate(String uname, String pass) throws SQLException {
		Connection conn = DBConnection.getConnection();
		//System.out.println(conn);
		PreparedStatement stmt = conn.prepareStatement("select * from LoginTable where uname=? and password=?");
		
		stmt.setString(1, uname);
		stmt.setString(2, pass);
		
		ResultSet res = stmt.executeQuery();
		//System.out.println("Hi");
		
		
		return (res.next());
	}
	

	
}
