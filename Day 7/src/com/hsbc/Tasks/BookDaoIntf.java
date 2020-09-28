package com.hsbc.Tasks;

import java.util.*;

public interface BookDaoIntf {
	
	void addBook(Book book);
	void deleteBook(int bookid);
	void showAllBooks();
	public Book getBookWithId(int bookid);
	public Book[] getBookwithAuthor(String author);
	public List<Book> getBooksContainingName(String str);
	public void applyDiscount(double Discount);
	
	
}