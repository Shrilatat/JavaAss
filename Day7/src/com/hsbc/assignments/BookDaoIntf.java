package com.hsbc.assignments;

import java.util.List;

public interface BookDaoIntf {

	void addBook(Book book);
	void deleteBook(int bookid);
	void ShowAllBooks();
	public Book getBookWithId(int bookid);
	public Book[] getBookWithAuthor(String author);
	public List<Book> getBooksContainingName(String str);
	public void applyDiscount(double discount);
}
