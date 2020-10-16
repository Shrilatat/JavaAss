package com.hsbc.servlet;

import java.io.IOException;
import java.sql.*;

public class UserDaoClass {

	Connection conn = null;

	public UserDaoClass() {
		conn = DBConnection.getConnection();
	}

	public Boolean validateUser(String name, String password) {

		try {
			String sql = "select * from utable where name = '" + name + "'";
			Statement stmt = conn.createStatement();
			ResultSet rs;

			rs = stmt.executeQuery(sql);

			rs.next();
			if(rs.getString(2).equals(password)) 
				return true;
			else
				return false;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		}
}
