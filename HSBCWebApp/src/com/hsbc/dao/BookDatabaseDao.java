package com.hsbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.model.Book;

public class BookDatabaseDao {

	Connection conn = null;

	public BookDatabaseDao() {
		conn = DBConnection.getConnection();
	}

	public List<Book> getAllBooks() throws SQLException {

		String sql = "select * from BookTable";
		Statement stmt = conn.createStatement();

		ResultSet res = stmt.executeQuery(sql);

		List<Book> books = new ArrayList<>();

		while (res.next()) {
			books.add(new Book(res.getString(1), res.getString(2), res.getInt(3)));
		}

		return books;
	}
	
	public Book getBookDetails(String bookname) throws SQLException {
		
		PreparedStatement stmt = conn.prepareStatement("select * from BookTable where bookname=?");
		stmt.setString(1, bookname);
		ResultSet res = stmt.executeQuery();
		res.next();
		Book book = new Book(res.getString(1), res.getString(2), res.getInt(3));
		return book;
	}

}
