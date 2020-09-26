package com.hsbc.assignment6;

import java.util.List;

public interface BookDaoIntf {
	void addBook(Book book);
	void deleteBook(int bookId);
	void showAllBooks();
	Book getBookWithId(int bookId);
	Book[] getBookWithAuthor(String author);
	List<Book> getBooksContainingName(String str);
	void applyDiscount(double discount);
}
