package com.hsbc.problem4;

import java.util.List;

interface BookDaoIntf {
	public void addBoook(Book book);	// adds a book object

	public void deleteBook(int bookid);	// delete book from collection

	public void showAllBooks();			// display all list of books

	public Book getBookWithId(int bookid);	// return book object with it id

	public Book[] getBookWithAuthor(String author); // get array of book having same author

	public List<Book> getBooksContainingName(String str); // return list of book containg same name

	public void applyDiscount(double discount);	// appply discount 

}
