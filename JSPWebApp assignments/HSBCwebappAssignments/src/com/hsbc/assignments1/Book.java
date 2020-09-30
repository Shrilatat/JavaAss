package com.hsbc.assignments1;

public class Book {
	private String language;
	private String title;
	private String bookid;

	public Book() {
	}

	public Book(String language, String title, String bookid) {
		super();
		this.language = language;
		this.title = title;
		this.bookid = bookid;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBookid() {
		return bookid;
	}

	public void setBookid(String bookid) {
		this.bookid = bookid;
	}

	@Override
	public String toString() {
		return "Book [language=" + language + ", title=" + title + ", bookid=" + bookid + "]";
	}

}