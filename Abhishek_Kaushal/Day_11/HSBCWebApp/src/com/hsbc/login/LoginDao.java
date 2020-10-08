package com.hsbc.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.hsbc.db.DBConnection;

public class LoginDao {
	DBConnection connection = new DBConnection();
	Connection conn = connection.getConnection();
	
	boolean validate(String uname, String password)
	{
		try {
			PreparedStatement pstmt = conn.prepareStatement("select password from users where username = ?");
			pstmt.setString(1, uname);
			ResultSet rs = pstmt.executeQuery();
			if(!rs.next())
			{
				return false;
			}
			if(rs.getString(1).equals(password))
			{
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
}
