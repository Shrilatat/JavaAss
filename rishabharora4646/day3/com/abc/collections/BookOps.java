package com.abc.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class BookOps {
	private Set<Book> allBooks = new HashSet();
	
	public void addBook(Book b) {
		allBooks.add(b);
	}
	
	public void deleteBook(int id) {
		Iterator<Book> it = this.allBooks.iterator();
		while(it.hasNext()) {
			Book b = it.next();
			if (b.getBookId() == id)
				it.remove();			
		}
	}
	
	public void showBooks() {
		for (Book b : allBooks)
			System.out.println(b);
	}
	
	public Book getBookWithId(int id) {
		Book rBook = new Book();
		for (Book b : allBooks) {
			if (b.getBookId() == id) {
				rBook = b;
			}
		}
		return rBook;
	}

	public Book[] getBookWithAuthor(String author) {
		Book[] rBook = new Book[allBooks.size()];
		int i = 0;
		for (Book b : allBooks) {
			if (b.getAuthor() == author) {
				rBook[i] = b;
				i = i + 1;
			}
		}
		return rBook;
	}	
}
