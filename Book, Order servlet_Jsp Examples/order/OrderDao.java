package com.hsbc.servletdemo.order;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.servletdemo.book.Book;
import com.hsbc.servletdemo.book.DBConnection;

public class OrderDao {
	Connection conn=null;
	
	public OrderDao() {
		conn=DBConnection.getConnection();
	}
	public Book getBook(String name1) throws SQLException{
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from books where bname='"+name1+"'");
		
		rs.next();
			Book b=new Book(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));	
		
		return b;
	}

}
