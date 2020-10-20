package com.assign.book;


public interface BookDaoIntf {
	
	void addBook(Book book);
	void deleteBook(int bookid);
	void showAllBooks();
	public Book getBookWithId(int bookid);
	public void applyDiscount(double Discount);
	

}
