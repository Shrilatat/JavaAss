package com.hsbc.assignment6;

import java.util.Arrays;

public class TestBookOp {

	public static void main(String[] args) {

		BookDaoIntf dao = new BookDao();
		dao.addBook(new Book(101,"Effective Java","ABC",1000));
		dao.addBook(new Book(102,"Let us C","PQR",500));
		dao.addBook(new Book(103,"Head First Java","ABC",200));
		dao.addBook(new Book(104,"Let us Java","YXZ",1200));
		
		dao.showAllBooks();
		
		System.out.println("Deleting Book with ID '102'");
		dao.deleteBook(102);
		dao.showAllBooks();
		
		System.out.println("After applying discount of Rs.50 ");
		dao.applyDiscount(50);
		dao.showAllBooks();
		
		try {
			System.out.println("Book Name Containing 'Java'");
			System.out.println(dao.getBooksContainingName("Java"));
			
			System.out.println("Book containing author as 'ABC'");
			System.out.println(Arrays.toString(dao.getBookWithAuthor("ABC")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
