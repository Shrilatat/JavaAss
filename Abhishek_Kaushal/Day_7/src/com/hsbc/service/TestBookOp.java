package com.hsbc.service;

import java.util.Arrays;

import com.hsbc.dao.BookDaoImpl;
import com.hsbc.dao.BookDaoIntf;
import com.hsbc.model.Book;

public class TestBookOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDaoIntf dao = new BookDaoImpl();
		dao.addBook(new Book(1, "Java Basics","Abhishek", 1000));
		dao.addBook(new Book(2, "Java Advance","Abhi", 1200));
		dao.addBook(new Book(3, "Let us C","Kaushal", 1400));
		dao.addBook(new Book(4, "Head First Java","Abhish ", 1600));
		dao.addBook(new Book(5, "Effective Java","Abhishek", 1800));
		dao.showAllBooks();
		System.out.println();
		
		dao.deleteBook(2);
		dao.showAllBooks();
		System.out.println();
		
		System.out.println(dao.getBookWithId(3));
		System.out.println();
		
		System.out.println(Arrays.asList(dao.getBookWithAuthor("Abhishek")));
		System.out.println();
		
		System.out.println(dao.getBooksContainingName("Java"));
		System.out.println();
		
		dao.applyDiscount(100);
		dao.showAllBooks();
		
		

	}

}
