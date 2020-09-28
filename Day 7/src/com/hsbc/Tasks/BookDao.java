package com.hsbc.Tasks;

import java.util.*;

public class BookDao implements BookDaoIntf{

	List<Book> books = new LinkedList<>();
	
	public void addBook(Book book) {
		books.add(book);
	}

	public void deleteBook(int bookid) {
		for(Iterator<Book> iterator = books.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
				if(book.getBookId() == bookid)
					iterator.remove();
		}
	}
	
	public void showAllBooks() {
		for(Book book : books) {
			System.out.println(book);
		}
	}
	
	public Book getBookWithId(int bookid) {
		for(Iterator<Book> iterator = books.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
				if(book.getBookId() == bookid)
					return book;
		}
		return null;
	}
	
	public Book[] getBookwithAuthor(String author) {
		List<Book> bList = new ArrayList<>();
		for(Iterator<Book> iterator = books.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
				if(book.getAuthor().equals(author)==true) 
					bList.add(book);
		}
				Book[] bArr = new Book[bList.size()];
				bList.toArray(bArr);
		return bArr;
	}
	
	public List<Book> getBooksContainingName(String str){
		List<Book> blist = new ArrayList<>();
		for(Iterator<Book> iterator = books.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
				if(book.getBname().contains(str))
					blist.add(book);
		}
		return blist;
	}
	
	public void applyDiscount(double discount) {
		for(Iterator<Book> iterator = books.iterator(); iterator.hasNext();) {
			Book book = (Book) iterator.next();
				book.setPrice(book.getPrice()-discount);
		}
	}
}
