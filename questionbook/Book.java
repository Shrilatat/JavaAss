package com.hsbc.books;

public class Book {
	private String language;
	private String title;

	public Book() {}

	public Book(String lang, String title) {
		super();
		this.language = lang;
		this.title = title;
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

	@Override
	public String toString() {
		return "Book [language=" + language + ", title=" + title + "]";
	}


} 