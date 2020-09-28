package com.hsbc.Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BookDao implements BookDaoIntf{
	TreeSet<Book> bookSet = new TreeSet<>();

	@Override
	public void addBook(Book book) {
		bookSet.add(book);
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		for (Iterator iterator = bookSet.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			if(book.getBookId() == bookId)
				iterator.remove();
		}
	}

	@Override
	public void showAllBooks() {
		for (Iterator iterator = bookSet.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			System.out.println(book);
		}
	}

	@Override
	public Book getBookWithId(int bookId) {
		// TODO Auto-generated method stub
		Book temp = new Book();
		for (Iterator iterator = bookSet.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			if(book.getBookId() == bookId){
				temp = book;
				break;
		}
			else
				temp = null;
		}
		return temp;
	}

	@Override
	public Book[] gotBookWithAuthor(String author) {
		List<Book> temp = new ArrayList<>();
		int i = 0;
		for (Iterator iterator = bookSet.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			if(book.getAuthor().equals(author)){
				temp.add(book);
			}
		}
		Book[] res = new Book[temp.size()];
		res = temp.toArray(res);
		return res;
	}

	@Override
	public List<Book> getBooksContainingName(String str) {
		List<Book> temp = new ArrayList();
		
		for (Iterator iterator = bookSet.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			if(book.getBname().equals(str)){
				temp.add(book);
			}
		}
		return temp;
	}

	@Override
	public void applyDiscount(double discount) {
		// TODO Auto-generated method stub
		double tempDiscount = 0;
		for (Iterator iterator = bookSet.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
			tempDiscount = book.getPrice() - discount;
			book.setPrice(tempDiscount);
		}
		
		for (Book book : bookSet) {
			System.out.println(book);
		}
	}
	
	
}
