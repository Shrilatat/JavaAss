package com.hsbc.BookEx;

import java.util.List;

public interface BookDaoIntf {
	void addBook(Book book);
	void deleteBook(int bookid);
	void showAllBooks();
	public Book getBookWithId(int bookid);
	Book[] getBookWithAuthor(String author);
	List<Book> getBookContainingName(String name);
	void applyDiscount(double discount);
	
}
