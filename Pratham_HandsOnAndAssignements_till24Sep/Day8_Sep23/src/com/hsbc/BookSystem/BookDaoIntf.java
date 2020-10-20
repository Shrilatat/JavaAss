package com.hsbc.BookSystem;

import java.util.List;

public interface BookDaoIntf {
	void addBook(Book book);
	void deleteBook(int bookID);
	void showAllBooks();
	Book getBookWithId(int bookID);
	Book[] getBookWithAuthor(String author);
	List<Book> getBooksContainingName(String str);
	void applyDiscount(double discount);
}
