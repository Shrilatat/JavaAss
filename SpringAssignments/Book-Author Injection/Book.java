package com.trg;

public class Book {
	private int bookId;
	private String bookTitle;
	private String authorName;
	private int isbnNumber;
	private String publication;
	private double price;
	
	Author author;

	public Book(int bookId, String bookTitle, String authorName, int isbnNumber, String publication, double price) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.isbnNumber = isbnNumber;
		this.publication = publication;
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getIsbnNumber() {
		return isbnNumber;
	}

	public void setIsbnNumber(int isbnNumber) {
		this.isbnNumber = isbnNumber;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", authorName=" + authorName + ", isbnNumber="
				+ isbnNumber + ", publication=" + publication + ", price=" + price + ", author=" + author + "]";
	}

}
