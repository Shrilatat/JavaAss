package com.trg;

public class Book2 {
	
	int bookId;
	String title;
	Author author;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book2 [bookId=" + bookId + ", title=" + title + ", author=" + author + "]";
	}
	
	
	
	
	
	
	

}
