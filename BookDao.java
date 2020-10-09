package com.hsbc.database;

import java.sql.*;
import java.util.*;

public class BookDao {
	
	Connection conn=null;
	
	public BookDao() {
		conn=DBConnection.getConnection();
	}
	public List<Book> getAllBooks(String cat) throws SQLException{
		List<Book> b=new ArrayList<Book>();
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from book where bookCategory='"+cat+"'");
		
		while(rs.next())
		{
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(4));
			b.add(new Book(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4)));	
		}
		return b;
	}

}
