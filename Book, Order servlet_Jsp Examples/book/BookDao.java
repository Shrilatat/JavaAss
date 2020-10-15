package com.hsbc.servletdemo.book;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class BookDao {
	
	Connection conn=null;
	
	public BookDao() {
		conn=DBConnection.getConnection();
	}
	public List<Book> getAllBooks(String cat1) throws SQLException{
		List<Book> b=new ArrayList<Book>();
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from books where cat='"+cat1+"'");
		
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
