package com.hsbc;

public class Book implements Comparable<Book> {
	private String category;
	private String bname;
	private String author;
	private int price;

	public Book() {
	}

	public Book( String bname, String author,String cate, int price) {
		super();
		this.bname = bname;
		this.author = author;
		this.category=category;
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [Category=" + category + ", bname=" + bname + ", author=" + author + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Book o) {

		return this.getCategory().compareTo(o.getCategory());
	}

	

}
