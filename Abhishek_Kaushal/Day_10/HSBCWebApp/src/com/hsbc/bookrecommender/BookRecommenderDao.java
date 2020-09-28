package com.hsbc.bookrecommender;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.db.DBConnection;

public class BookRecommenderDao {
	DBConnection connection = new DBConnection();
	Connection conn = connection.getConnection();

	public String[] getBooks(String category)
	{
		
		try {
			//System.out.println(conn);
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

}
