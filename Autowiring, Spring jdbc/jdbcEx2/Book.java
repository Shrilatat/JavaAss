package com.hsbc.jdbcEx2;

public class Book {
	int id;
	String bname;
	String author;
	String pubHouse;
	int price;
	
	
	public Book() {
	}
	public Book(int id, String bname, String author, String pubHouse, int price) {
		super();
		this.id = id;
		this.bname = bname;
		this.author = author;
		this.pubHouse = pubHouse;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
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
	public String getPubHouse() {
		return pubHouse;
	}
	public void setPubHouse(String pubHouse) {
		this.pubHouse = pubHouse;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", bname=" + bname + ", author=" + author + ", pubHouse="
				+ pubHouse + "]";
	}
	
}
