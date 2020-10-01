package com.hsbc.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import com.hsbc.model.Book;


public class BookDao {
	static Connection conn = null;
	List<Book> dao = new ArrayList<>();
	
	public BookDao() {
		conn = DBConnection.getConnection();
	}

	
	
	public void add(Book b) {
		try {
			Statement stmt = conn.createStatement();
			String addQuery = "insert into book values("+b.getBookId()+","+b.getBookName()+","+b.getAuthor()+","+b.getPrice()+");";
			stmt.executeUpdate(addQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dao.add(b);
	}
	
	public Book getBookById(int id) {
		Book temp = new Book();
		try {
			Statement stmt = conn.createStatement();
			String fetchQuery  = "select * from book where bookid="+id+";";
			for(Book b: dao) {
				if(b.getBookId()==id) {
					ResultSet rs = stmt.executeQuery(fetchQuery);
					rs.next();
					temp.setBookId(rs.getInt(1));
					temp.setBookName(rs.getString(2));
					temp.setAuthor(rs.getString(3));
					temp.setPrice(rs.getInt(4));
				}
			}
			ResultSet rs = stmt.executeQuery(fetchQuery);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}
}
