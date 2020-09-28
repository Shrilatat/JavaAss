package com.hsbc.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class LoginDao {

	Connection conn = null;

	public LoginDao() {
		conn = DBConnection.getConnection();

	}

	public Boolean validate(String name, String password) {

		try {
			String sql = "select * from users where name = '" + name + "'";
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
