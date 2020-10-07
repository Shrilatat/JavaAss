package com.trg;

public class Book {
	
	int bookId;
	String title;
	String name;
	int isbn;
	
	
	
	
	public Book(int bookId, String title, String name, int isbn) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.name = name;
		this.isbn = isbn;
	}




	/*
	 * public void setBookId(int bookId) { this.bookId = bookId; } public String
	 * getTitle() { return title; } public void setTitle(String title) { this.title
	 * = title; } public String getName() { return name; } public void
	 * setName(String name) { this.name = name; } public int getIsbn() { return
	 * isbn; } public void setIsbn(int isbn) { this.isbn = isbn; } public int
	 * getBookId() { return bookId; }
	 */
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", name=" + name + ", isbn=" + isbn + "]";
	}
	
	

}
