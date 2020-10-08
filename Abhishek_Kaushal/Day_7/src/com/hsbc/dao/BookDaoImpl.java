package com.hsbc.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.hsbc.model.Book;

public class BookDaoImpl implements BookDaoIntf {
	
	Set<Book> books = new TreeSet<>();

	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		books.add(book);
		
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		for(Book b:books)
		{
			if(b.getBookId() == bookId)
			{
				books.remove(b);
				return;
			}
		}
		System.out.println("No book with given book id found");
		
	}

	@Override
	public void showAllBooks() {
		// TODO Auto-generated method stub
		for(Book b:books)
		{
			System.out.println(b);
		}
		
	}

	@Override
	public Book getBookWithId(int bookId) {
		// TODO Auto-generated method stub
		for(Book b:books)
		{
			if(b.getBookId() == bookId)
			{
				return b;
			}
		}
		
		return null;
	}

	@Override
	public Book[] getBookWithAuthor(String bookAuthor) {
		// TODO Auto-generated method stub
		List<Book> li = new ArrayList<>();
		for(Book b:books)
		{
			if(b.getBookAuthor().equals(bookAuthor))
			{
				li.add(b);
			}
		}
		Book[] arr=new Book[li.size()];
		
		return li.toArray(arr);
	}

	@Override
	public List<Book> getBooksContainingName(String str) {
		// TODO Auto-generated method stub
		List<Book> li = new ArrayList<>();
		for(Book b:books)
		{
			if(b.getBookName().contains(str))
			{
				li.add(b);
			}
		}
		return li;
	}

	@Override
	public void applyDiscount(double discount) {
		// TODO Auto-generated method stub
		for(Book b:books)
		{
			if(b.getBookPrice()>=discount)
				b.setBookPrice(b.getBookPrice()-discount);
			else
				System.out.println("Invalid discount");
		}
		
	}

}
