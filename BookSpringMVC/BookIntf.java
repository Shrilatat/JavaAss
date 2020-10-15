package com.hsbc;

import java.util.List;

public interface BookIntf {

	public List<Book> getAllBooks();
	public Book getBookById(int id);
	public List<Book> getBooksByAuthor(String auth);
	public List<Book> getBooksByPublication(String publ);
	public List<Book> getBooksContainingTitle(String name);
	public int addBook(Book b);
	public int deleteBook(int id);
	public int increasePrice(Book book, int amt);
	public String getAuthor(Book book);
	public void updateBatchPrice(List<Book> list);
	
}
