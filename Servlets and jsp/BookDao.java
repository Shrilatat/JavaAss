package com.hsbc;

import java.awt.print.Book;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
	
	Connection conn = null;
	
	public BookDao()
	{
		conn = DBConnection.getConnection();
	}
	
	public List<book> getBooks(String ne)
	{
		List<Book> book = new ArrayList<Book>();
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery("select * from book where category="+ ne);
		
		while(rs.next())
		{
		
			book.add(new Book(rs.getString(1) , rs.getString(2) , rs.getString(3));
		}
		
		return book;
	}
	

}
