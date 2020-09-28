package com.hsbc.assignments;

import java.util.*;

public class BookDao implements BookDaoIntf {

	TreeSet<Book> set1=new TreeSet<>();
	@Override
	public void addBook(Book book) {
		set1.add(book);
		System.out.println(set1);
	}

	@Override
	public void deleteBook(int bookid) {
		// TODO Auto-generated method stub
		for (Book book : set1) {
			if(book.getBookId()==bookid)
			{
				set1.remove(book);
			}
		}
		System.out.println(set1);
	}

	@Override
	public void ShowAllBooks() {
		// TODO Auto-generated method stub
		for (Book book : set1) {
			System.out.println(book);
		}
		
	}

	@Override
	public Book getBookWithId(int bookid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book[] getBookWithAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBooksContainingName(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void applyDiscount(double discount) {
		// TODO Auto-generated method stub
		
	}

}
