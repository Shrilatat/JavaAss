package com.hsbc.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpLoginDao {

	Connection conn = DBConnection.getConnection();

	Boolean validateUser(String ename, String epass) {
		try {
			String str = "Select * from emplogin where ename= ? and pass = ?";
			PreparedStatement pst = conn.prepareStatement(str);
			pst.setString(1, ename);
			pst.setString(2, epass);
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
