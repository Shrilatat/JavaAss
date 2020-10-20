package com.hsbc.BookSystem;

public class Book implements Comparable<Book>{
	private int bookID;
	private String bName;
	private String author;
	private double price;
	
	public Book() {
		super();
	}
	
	public Book(int bookID, String bName, String author, double price) {
		super();
		this.bookID = bookID;
		this.bName = bName;
		this.author = author;
		this.price = price;
	}
	
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "["+bookID+","+bName+","+author+","+price+"]";
	}

	@Override
	public int compareTo(Book o) {	
		return this.getBookID()-o.getBookID();
	}
}
