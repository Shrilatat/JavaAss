package com.hsbc.spring;

public class Book {

	private int bookid;
	private String bookTitle;
	private String author;
	private int isbnno;
	private String publication;
	
	public Book(int bookid, String bookTitle, String author, int isbnno, String publication) {
		super();
		this.bookid = bookid;
		this.bookTitle = bookTitle;
		this.author = author;
		this.isbnno = isbnno;
		this.publication = publication;
	}

//	public int getBookid() {
//		return bookid;
//	}
//
//	public void setBookid(int bookid) {
//		this.bookid = bookid;
//	}
//
//	public String getBookTitle() {
//		return bookTitle;
//	}
//
//	public void setBookTitle(String bookTitle) {
//		this.bookTitle = bookTitle;
//	}
//
//	public String getAuthor() {
//		return author;
//	}
//
//	public void setAuthor(String author) {
//		this.author = author;
//	}
//
//	public int getIsbnno() {
//		return isbnno;
//	}
//
//	public void setIsbnno(int isbnno) {
//		this.isbnno = isbnno;
//	}
//
//	public String getPublication() {
//		return publication;
//	}
//
//	public void setPublication(String publication) {
//		this.publication = publication;
//	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookTitle=" + bookTitle + ", author=" + author + ", isbnno=" + isbnno
				+ ", publication=" + publication + "]";
	}
	
}
