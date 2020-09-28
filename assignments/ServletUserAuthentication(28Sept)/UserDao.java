package com.hsbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * DAO class that access usertable in TESTDB3 database to check credentials of user
 * @author ADITI GUPTA
 *
 */

public class UserDao {

	Connection conn = DBConnection.getConnection();

	Boolean validateUser(String uname, String upass) {
		try {
			String str = "Select * from usertable where Name= ? and password = ?";
			PreparedStatement pst = conn.prepareStatement(str);
			pst.setString(1, uname);
			pst.setString(2, upass);
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
