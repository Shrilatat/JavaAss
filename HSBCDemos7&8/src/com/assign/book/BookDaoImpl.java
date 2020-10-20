package com.assign.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BookDaoImpl implements BookDaoIntf{
		       
Set<Book> books = new TreeSet<>();
	@Override
	public void addBook(Book book) {
		books.add(book);
		
	}

	@Override
	public void deleteBook(int bookid) {
		
		for(Book book : books)
		{
			if(book.getBookid( ) == bookid)
			{
				books.remove(book);
			}
		}
			
		
	}

	@Override
	public void showAllBooks() {
		
		for(Book book : books)
		{
			System.out.println(book);		
			}
			
	}

	@Override
	public Book getBookWithId(int bookid) {
		
		for(Book book : books)
		{
			if(book.getBookid( ) == bookid)
			{
				return book;
			}
		}
		return null;
		
	}

	
	@Override
	public void applyDiscount(double Discount) {
		
		for(Book book: books)
		{
			if(book.getPrice() >= Discount)
			{
				book.setPrice(book.getPrice() - Discount);
			}
			else
			{
				System.out.println("Discount cannot be applied");
			}
		}
		
	}

}
