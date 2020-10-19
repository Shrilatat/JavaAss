package com.webdemo.models;

public class Book {
	
	private String bookname;
	private String author;
	private int price;
	private String subject;
	
	
	public Book(String bookname, String author, int price, String subject) {
		super();
		this.bookname = bookname;
		this.author = author;
		this.price = price;
		this.subject = subject;
	}
	
	
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}


	@Override
	public String toString() {
		return "Book [bookname=" + bookname + ", author=" + author + ", price=" + price + ", subject=" + subject + "]";
	}
	
}
