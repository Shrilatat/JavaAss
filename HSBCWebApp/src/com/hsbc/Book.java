package com.hsbc;
/**
 * 
 * @author suryavanshi
 *
 */
public class Book {
	String lang;
	String title;
	int price;
	public Book(String lang, String title, int price) {
		super();
		this.lang = lang;
		this.title = title;
		this.price = price;
	}
	public String getLang() {
		return lang;
	}
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Book [lang=" + lang + ", title=" + title + ", price=" + price + "]";
	}
	
}
