package com.hsbc.database;

public class Book {
	private String bname;
	private String author;
	private String cat;
	private int price;
	public Book(String bname, String author, String cat, int price) {
		super();
		this.bname = bname;
		this.author = author;
		this.cat = cat;
		this.price = price;
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
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
