package com.hsbc.assignment6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class BookDao implements BookDaoIntf{

	TreeSet<Book> bookSet = new TreeSet<>();
	
	@Override
	public void addBook(Book book) {
		bookSet.add(book);
	}

	@Override
	public void deleteBook(int bookId) {
		
		for (Iterator iterator = bookSet.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			if(book.getBookId() == bookId)
				iterator.remove();
		}
	}

	@Override
	public void showAllBooks() {
		for (Book book : bookSet) {
			System.out.println(book);
		}
	}

	@Override
	public Book getBookWithId(int bookId) {
		for (Iterator iterator = bookSet.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			if(book.getBookId() == bookId)
				return book;
		}
		return null;
	}

	@Override
	public Book[] getBookWithAuthor(String author) {
		
		List<Book> authorList = new ArrayList<>();
		for (Iterator iterator = bookSet.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			if(book.getAuthor().equals(author)) {
				authorList.add(book);
			}
		}
		Book[] b = new Book[authorList.size()];
		authorList.toArray(b);
		return b;
	}

	@Override
	public List<Book> getBooksContainingName(String str) {
		List<Book> nameList = new ArrayList<>();
		for (Iterator iterator = bookSet.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			String temp = book.getBname();
			if(temp.contains(str)) {
				nameList.add(book);
			}
		}
		return nameList;

	}

	@Override
	public void applyDiscount(double discount) {
		
		for (Iterator iterator = bookSet.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			book.setPrice(book.getPrice()-discount);
		}
		
	}
	
}
