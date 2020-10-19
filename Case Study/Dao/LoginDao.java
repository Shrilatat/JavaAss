package com.trg.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao  {
	 
	
	 Connection conn = DatabaseConnection.getConnection();
	
	
	
	 public Boolean validate(String uname, String pass) {
		
		String str = "Select * from login where uname = ? and pass = ? ";
		PreparedStatement pst;
		try {
			pst = conn.prepareStatement(str);
			pst.setString(1, uname);
			pst.setString(2, pass);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				DatabaseConnection.closeConnection();
				return true;}
			else return false;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
		
		
		
		return null;
		

	}

}
