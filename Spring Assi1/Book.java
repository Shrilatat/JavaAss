package com.hsbc.book;

public class Book {
	
	int bookID;
	String title;
	Author author;
	String publication;
	int price;
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
//		return "Book [bookID=" + bookID + ", title=" + title + ", author=" + author
//				+ ", publication=" + publication + ", price=" + price + "]";
		
		return "'" + title + "'" + " by " + author + ":\n" + "Publication : " + publication + "\n" + "Price : " + price + "\n";
	}
	
}
