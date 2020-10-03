package com.hsbc.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hsbc.db.DBConnection;

public class EmployeeValidateDao {
	DBConnection connection = new DBConnection();
	Connection conn = connection.getConnection();
	
	public boolean validate(String username , String password)
	{
		try {
			System.out.println(conn);
			PreparedStatement pstmt = conn.prepareStatement("select password from users where username = ?");
			pstmt.setString(1, username);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
				if(password.equals(rs.getString(1)))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
