package com.hsbc.model;

public class Book {
	private String bookName;
	private String author;
	private int price;
	public Book(String bookName, String author, int price) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", price=" + price + "]";
	}
	
	
}
