package com.hsbc.assignment6;

public class Book implements Comparable<Book> {
	private int bookId;
	private String bname;
	private String author;
	private double price;
	
	public Book(int bookId, String bname, String author, double price) {
		super();
		this.bookId = bookId;
		this.bname = bname;
		this.author = author;
		this.price = price;
	}
	
	public int getBookId() {
		return bookId;
	}
	public String getBname() {
		return bname;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bname=" + bname + ", author=" + author + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Book o) {
		return this.getBookId()-o.getBookId();
	}
	
}
