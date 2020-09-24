package com.hsbc.BookSystem;

import java.util.*;

public class TestBookOp {
	public static void main(String[] args) {
		BookDaoIntf books = new BookDaoImpl();
		books.addBook(new Book(1,"Learn Java","A",270.0));
		books.addBook(new Book(2,"Learn Advanced Java","A",370.0));
		books.addBook(new Book(3,"Learn Java Servlets","B",270.0));
		
		books.showAllBooks();
		Book searchedBook=books.getBookWithId(3);
		System.out.println("The searched book is : \n"+searchedBook);
		//books.getBookWithAuthor("A");
		List<Book> subList= new ArrayList<>();
		subList=books.getBooksContainingName("Learn");
		System.out.println("Books containing entered string : \n"+subList);
		books.applyDiscount(20.0);
		System.out.println(books);
		books.deleteBook(2);
		
		
	}
}
