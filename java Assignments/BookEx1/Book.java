package com.hsbc.BookEx;

public class Book implements Comparable<Book>{
	private int bookId;
	private String bname;
	private String author;
	private double price;
	public Book() {	}
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
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
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
		return "Book [bookId=" + bookId + ", bname=" + bname + ", author=" + author + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Book o) {
		
		return this.getBname().compareTo(o.getBname());
	}
	
	
	
}
