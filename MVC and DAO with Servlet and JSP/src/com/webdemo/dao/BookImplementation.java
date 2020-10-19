package com.webdemo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.webdemo.models.Book;

public class BookImplementation implements IBook{
	
	public BookImplementation() {
		super();
		connect();
	}

	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public boolean connect() {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();	
			connect = DriverManager.getConnection("jdbc:derby://localhost:1527/FirstDB","admin","password");
			if(connect!=null)
				return true;
			else
				return false;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return false;
	}


	@Override
	public ArrayList<Book> getBooksBySubject(String subject) {
	
		ArrayList<Book> books = new ArrayList<>();
		
		if(connect==null)
			System.out.println("Connection failed");
		else {
			
		try {
			System.out.println("connected");
			statement = connect.createStatement();
			resultSet = statement.executeQuery("select * from books where subject='"+subject+"'");
			
			while(resultSet.next()) {
				String name,author,subjects;
				int price=0;
				name=resultSet.getString("bookname");
				author=resultSet.getString("author");
				subjects=resultSet.getString("subject");
				price=Integer.parseInt(resultSet.getString("price"));
				books.add(new Book(name,author,price,subjects));				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
		System.out.println("Books in Subject "+books);

		return books;

	}

	@Override
	public ArrayList<Book> getBooksByAuthor(String author) {
		
		
		ArrayList<Book> books = new ArrayList<>();
		
		if(connect==null)
			System.out.println("Connection failed");
		else {
			
		try {
			System.out.println("connected in author");
			statement = connect.createStatement();
			resultSet = statement.executeQuery("select * from books where author='"+author+"'");
			
			while(resultSet.next()) {
				String name,authors,subject;
				int price=0;
				name=resultSet.getString("bookname");
				authors=resultSet.getString("author");
				subject=resultSet.getString("subject");
				price=Integer.parseInt(resultSet.getString("price"));
				books.add(new Book(name,authors,price,subject));				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
		System.out.println("Books in Author "+books);

		return books;
	
	}

}
