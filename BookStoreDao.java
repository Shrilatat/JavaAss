package com.trg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class BookStoreDao {
Connection conn=null;
	
	public BookStoreDao() {
		conn= DBConnection.getConnection();
	}

	public String[] getBooks(String category)
	{
		
		try {
			PreparedStatement pstmt = conn.prepareStatement("select bookName from books where bookCategory=?");
			pstmt.setString(1, category);
			ResultSet rs = pstmt.executeQuery();
			List<String> books = new ArrayList<>();
			while(rs.next())
			{
				books.add(rs.getString(1));
			}
			String[] bookArr = new String[books.size()];
			books.toArray(bookArr);
			return bookArr;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
