package com.hsbc;

public class Book {
	int bookId;
	String bookTitle;
	String authorName;
	int isbnNo;
	String publicationHouse;
	int price;
	
	
	public Book(int bookId, String bookTitle, String authorName, int isbnNo, String publicationHouse, int price) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
		this.isbnNo = isbnNo;
		this.publicationHouse = publicationHouse;
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
	public int getIsbnNo() {
		return isbnNo;
	}
	public void setIsbnNo(int isbnNo) {
		this.isbnNo = isbnNo;
	}
	public String getPublicationHouse() {
		return publicationHouse;
	}
	public void setPublicationHouse(String publicationHouse) {
		this.publicationHouse = publicationHouse;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", authorName=" + authorName + ", isbnNo="
				+ isbnNo + ", publicationHouse=" + publicationHouse + ", price=" + price + "]";
	}
	
	
}
