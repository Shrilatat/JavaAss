package com.hsbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookFindDao {

	Connection conn = DBConnection.getConnection();

	ResultSet getBooks(String bookCat) {
		try {
			String str = "Select * from Book where Bcategory=?";
			PreparedStatement pst = conn.prepareStatement(str);
			pst.setString(1, bookCat);
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
