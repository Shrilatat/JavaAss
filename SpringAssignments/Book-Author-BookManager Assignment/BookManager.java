package com.trg;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
	
	List<Book> books = new ArrayList<>();
	
	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public List<Book> getBooks(){
		
		return books;
	}
	
	public List<Book> getBooksByAuthorName(String name){
		
		List<Book> b1 = new ArrayList<>();
		for (Book b : books) {
			if (b.getAuthor().getLastName().equals(name))
				b1.add(b);
		}
		return b1;
	}
	
	public Book getBookWithId(int id) {
		for (Book b : books) {
			if (b.getBookId() == id)
				return b;
		}
		return null;
	}
}
