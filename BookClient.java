package com.jdbcassign1;

public class BookClient {
	public static void main(String[] args) {
		BookDao b = new BookDao();
		b.addBook(new Book(3,"Book3","Auth3",500));
		b.addBook(new Book(4,"Book4","Auth4",2500));
		System.out.println(b.retrieveAllBooks());
		b.addBook(new Book(1,"Book1","Auth1",1200));
		System.out.println(b.retrieveAllBooks());
		b.deleteBook(1);
		b.updateBook(2, 1500);
		System.out.println(b.retrieveBookById(2));
		System.out.println(b.retrieveAllBooks());
	}

}
