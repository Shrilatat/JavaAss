package com.hsbc.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/**
 * Dao class which inserts the form parameters in userdetail table
 * @author ADITI GUPTA
 *
 */
public class UserDetailDao {
	 

		Connection conn = DBConnection.getConnection();

		public Boolean addContact(UserDetailBean ub) {
			try {
				int c=0;
				String str = "Insert into userdetail values(?,?,?,?,?,?,?)";
				PreparedStatement pst = conn.prepareStatement(str);
				pst.setString(1, ub.getName());
				pst.setString(2, ub.getPass());
				pst.setString(3, ub.getEmail());
				pst.setString(4, ub.getGender());
				pst.setInt(5, ub.getAge());
				pst.setString(6, ub.getAddress());
				pst.setInt(7, ub.getContact());
				pst.executeUpdate();
				return true;
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
return false;
		}
	}

