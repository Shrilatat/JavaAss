package com.hsbc.dao;

import java.util.List;

import com.hsbc.model.Book;

public interface BookDaoIntf {
	void addBook(Book book);
	void deleteBook(int bookId);
	void showAllBooks();
	Book getBookWithId(int bookId);
	Book[] getBookWithAuthor(String bookAuthor);
	List<Book> getBooksContainingName(String str);
	void applyDiscount(double discount);

}
