package com.hsbc.BookEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class BookDao implements BookDaoIntf {
	Set<Book> books=new TreeSet<>();
	
	@Override
	public void addBook(Book book) {
		books.add(book);
		System.out.println(books);
		
	}

	@Override
	public void deleteBook(int bookid) {
		for (Iterator<Book> iterator = books.iterator(); iterator.hasNext();) {
			Book b = iterator.next();
			if (b.getBookId()==bookid) {
				iterator.remove();
			}
		}
		System.out.println(books);
	}

	@Override
	public void showAllBooks() {
		for(Book b:books)
			System.out.println(b);
		
	}

	@Override
	public Book getBookWithId(int bookid) {
		for(Book b:books)
		{
			if(b.getBookId()==bookid)
				return b;
		}
		return null;
	}

	@Override
	public Book[] getBookWithAuthor(String author) {
		List<Book> newlist=new ArrayList<>();
		for(Book b:books)
			if(b.getAuthor().contains(author))
				newlist.add(b);
		Book[] bb=new Book[newlist.size()];
		newlist.toArray(bb);
		return bb;
	}

	@Override
	public List<Book> getBookContainingName(String name) {
		List<Book> newlist=new ArrayList<>();
		for(Book b:books)
			if(b.getBname().contains(name))
				newlist.add(b);
		return newlist;
	}

	@Override
	public void applyDiscount(double discount) {
		for(Book b:books)
		{
			b.setPrice(b.getPrice()-discount);
		}
		System.out.println(books);
		
	}

}
