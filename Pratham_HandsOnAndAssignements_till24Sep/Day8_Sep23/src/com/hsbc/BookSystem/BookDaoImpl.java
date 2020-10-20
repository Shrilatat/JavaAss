package com.hsbc.BookSystem;

import java.util.*;

public class BookDaoImpl implements BookDaoIntf {

	Set<Book> bookSet = new TreeSet<Book>();
	
	
	@Override
	public void addBook(Book book) {
		bookSet.add(book);
	}

	@Override
	public void deleteBook(int bookID) {
		for(Book b: bookSet) {
			if(b.getBookID()==bookID) {
				bookSet.remove(b);
			}
		}
		
	}

	@Override
	public void showAllBooks() {
		for(Book b: bookSet) {
			System.out.println(b);
		}
		
	}

	@Override
	public Book getBookWithId(int bookID) {
		Book dispBook= new Book();
		for(Book b: bookSet) {
			if(b.getBookID()==bookID) {
				dispBook=b;
			}
		}
		return dispBook;
	}

	@Override
	public Book[] getBookWithAuthor(String author) {
		List<Book> bookList=new ArrayList<>();
		for(Book b: bookSet) {
			if(b.getAuthor()==author) {
				bookList.add(b);
			}
		}
		return (Book[]) bookList.toArray() ;
	}

	@Override
	public List<Book> getBooksContainingName(String str) {
		List<Book> bookList=new ArrayList<>();
		for(Book b: bookSet) {
			String bookName = b.getbName();
			if(bookName.contains(str)) {
				bookList.add(b);
				}
			}
		return bookList;
	}

	@Override
	public void applyDiscount(double discount) {
		for(Book b: bookSet) {
			b.setPrice(b.getPrice()-discount);
		}
		
	}

}
