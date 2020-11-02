package com.jdbcassign1;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.sql.*;

public class BookDao {
	private Connection conn=null;
	{
	try {
		DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
		conn=DriverManager.getConnection("jdbc:derby://localhost:1527/TestDB1");

	} catch (SQLException e) {
		e.printStackTrace();}
	}
	
	public void addBook(Book book) {
		Statement stmt=null;
		try {
			stmt = conn.createStatement();

			String sql = "INSERT INTO Bookstore VALUES("+book.getBookno()+",'"+book.getTitle()+"','"+book.getAuthor()+"',"+book.getPrice()+")";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void deleteBook(int bookid) {
		Statement stmt=null;
		try {
			stmt = conn.createStatement();

			String sql = "DELETE FROM Bookstore WHERE bookid="+bookid;
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public void updateBook(int bookid, float price) {
		Statement stmt=null;
		try {
			stmt = conn.createStatement();

			String sql = "UPDATE Bookstore SET PRICE=" + price + " WHERE bookid="+bookid;
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public List<Book> retrieveAllBooks() {
		Statement stmt=null;
		List<Book> list=new ArrayList<>();
		try {
			stmt = conn.createStatement();

			String sql = "SELECT * FROM Bookstore";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()) {
				Book b=new Book();
				b.setBookno(rs.getInt(1));
				b.setTitle(rs.getString(2));
				b.setAuthor(rs.getString(3));
				b.setPrice(rs.getFloat(4));
				list.add(b);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return list;
	
	}
	
	public Book retrieveBookById(int bookid) {
		Statement stmt=null;
		Book b=new Book();
		try {
			stmt = conn.createStatement();

			String sql = "SELECT * FROM Bookstore WHERE bookid="+bookid;
			ResultSet rs=stmt.executeQuery(sql);
			b.setBookno(rs.getInt(1));
			b.setTitle(rs.getString(2));
			b.setAuthor(rs.getString(3));
			b.setPrice(rs.getInt(4));
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return b;

	}
			
}

