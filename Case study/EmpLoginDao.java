package com.hsbc.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpLoginDao {

	Connection conn = DBConnection.getConnection();

	Boolean validateUser(String empname, String emppass) {
		try {
			String str = "Select * from emplogin where ename= ? and pass = ?";
			PreparedStatement pst = conn.prepareStatement(str);
			pst.setString(1, empname);
			pst.setString(2, emppass);
			ResultSet rs = pst.executeQuery();
			if (rs.next())
				return true;
			else
				return false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
