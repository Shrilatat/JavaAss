package com.hsbc.Assignment;

import java.util.List;

public interface BookDaoIntf {
	void addBook(Book book);
	void deleteBook(int bookId);
	void showAllBooks();
	public Book getBookWithId(int bookId);
	public Book[] gotBookWithAuthor(String author);
	public List<Book> getBooksContainingName(String str);
	public void applyDiscount(double discount);
}	
