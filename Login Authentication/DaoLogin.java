package com.hsbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoLogin {
	Connection conn=DBConnection.getConnection();
	Boolean verifyData(String name,String pass) {
	try {
		String str="Select * from task where uname=? and pass=?";
		PreparedStatement pst=conn.prepareStatement(str);
		pst.setString(1, name);
		pst.setString(2, pass);
		ResultSet rs=pst.executeQuery();
		if(rs.next())
			return true;
		else
			return false;
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return null;
	}
	/*
	 * boolean verifyData(String name,String pass) throws SQLException{ Statement
	 * stmt=conn.createStatement(); ResultSet
	 * rs=stmt.executeQuery("select * from task"); rs.next();
	 * System.out.println(rs.getString(1)); System.out.println(rs.getString(2));
	 * System.out.println(name); System.out.println(pass);
	 * if(name.equals(rs.getString(1)) && pass.equals(rs.getString(2))) {
	 * System.out.println("YES"); return true; } else { System.out.println("NO");
	 * return false; } }
	 */
}
