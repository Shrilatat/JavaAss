package com.hsbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DetailsDao {
	Connection conn = DBConnection.getConnection();

	public Boolean addDetails(DetailsBean obj) {
		try {
			String str = "Insert into Details values(?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(str);
			pst.setString(1, obj.getUsername());
			pst.setString(2, obj.getPassword());
			pst.setString(3, obj.getEmail());
			pst.setString(4, obj.getGender());
			pst.setInt(5, obj.getAge());
			pst.setString(6, obj.getAddress());
			pst.setInt(7, obj.getContnum());
			pst.executeUpdate();
			return true;


		} catch (SQLException e) {
			e.printStackTrace();
		}
return false;
	}

}
