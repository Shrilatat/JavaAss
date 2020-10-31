package com.abc.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookOps {
	
	
	private Connection conn=DbConn.getConnection() ;
	
	
	public void addBook(Book b) {
		Statement stmt=null;
		try {
			stmt = conn.createStatement();
			
			String sql = "INSERT INTO books VALUES("+b.getBookId()+",'"+b.getBname()+"','"+b.getAuthor()+"',"+b.getPrice()+")";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}		
	}
	
	public void deleteBook(int id) {
		Statement stmt=null;
		try {
			stmt = conn.createStatement();
			
			String sql = "DELETE FROM books WHERE bookid="+id;
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public void updateBook(int id,double price) {
		Statement stmt=null;
		try {
			stmt = conn.createStatement();
			String sql = "UPDATE books SET price="+price+" WHERE bookid="+id;
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public Book getBookWithId(int id) {
		Statement stmt=null;
		Book b = new Book();
		try {
			stmt = conn.createStatement();
			String sql = "SELECT * FROM books WHERE bookid="+id;
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			b.setBookId(rs.getInt(1));
			b.setAuthor(rs.getString(3));
			b.setBname(rs.getString(2));
			b.setPrice(rs.getDouble(4));
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}		
		return b;
	}

	public List<Book> getAllBooks() {
		List<Book> b = new ArrayList<>();
		Statement stmt=null;
		try {
			stmt = conn.createStatement();
			String sql = "SELECT * FROM books";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Book b2 = new Book();
				b2.setBookId(rs.getInt(1));
				b2.setAuthor(rs.getString(3));
				b2.setBname(rs.getString(2));
				b2.setPrice(rs.getDouble(4));
				b.add(b2);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}		
		return b;	
	}	
}
