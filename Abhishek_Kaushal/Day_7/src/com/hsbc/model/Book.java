package com.hsbc.model;

public class Book implements Comparable<Book> {

	private int bookId;
	private String bookName;
	private String bookAuthor;
	private double bookPrice;

	public Book(int bookId, String bookName, String bookAuthor, double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", bookPrice="
				+ bookPrice + "]";
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		if(this.getBookId()>o.getBookId())
		 return 1;
		else if(this.getBookId()<o.getBookId())
			 return -1;
		else
			return 0;
	}

}
