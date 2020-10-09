package com.hsbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDao {

	Connection conn = DBConnection.getConnection();

	public ResultSet getBooks(int bid) {
		try {
			String str = "Select * from Book where BId=?";
			PreparedStatement pst = conn.prepareStatement(str);
			pst.setInt(1, bid);
			ResultSet rs = pst.executeQuery();
			if (rs.next())
				return rs;
			else
				return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}
}