package com.abc.db;

public class BookClient {
	public static void main(String[] args) {
		BookOps b = new BookOps();
		b.addBook(new Book(3,"book1","Auth1",50.0));
		b.addBook(new Book(2,"book2","Auth2",60.0));
		b.deleteBook(1);
		b.updateBook(2, 75.0);
		System.out.println(b.getBookWithId(2));
		System.out.println(b.getAllBooks());
	}
}
