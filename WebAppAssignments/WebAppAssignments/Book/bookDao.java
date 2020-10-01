package com.trg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class bookDao {
	  static Connection conn = DatabaseConnection.getConnection();
	
	
	
	 public static String getBook(int bookId) {
		 if(conn ==  null)
		 {
			 System.out.println("null object");
		 }
		 
		
		String str = "Select * from booktable where bookId=?";
		PreparedStatement pst;
		try {
			pst = conn.prepareStatement(str);
			pst.setInt(1, bookId);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				
				return rs.getString("bookName");
			}
				
				
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
		
		
		
		return null;
		

	}


}
