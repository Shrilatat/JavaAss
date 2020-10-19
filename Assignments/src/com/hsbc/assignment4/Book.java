package com.hsbc.assignment4;

public class Book implements Comparable<Book>{

	private int bookid;
	private String bname,author;
	private double price;
	/**
	 * 
	 */
	public Book() {
		super();
	}
	/**
	 * @param bookid
	 * @param bname
	 * @param author
	 * @param price
	 */
	public Book(int bookid, String bname, String author, double price) {
		super();
		this.bookid = bookid;
		this.bname = bname;
		this.author = author;
		this.price = price;
	}
	/**
	 * @return the bookid
	 */
	public int getBookid() {
		return bookid;
	}
	/**
	 * @param bookid the bookid to set
	 */
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	/**
	 * @return the bname
	 */
	public String getBname() {
		return bname;
	}
	/**
	 * @param bname the bname to set
	 */
	public void setBname(String bname) {
		this.bname = bname;
	}
	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bname=" + bname + ", author=" + author + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Book arg0) {
		// TODO Auto-generated method stub
		return this.bookid-arg0.bookid;
		
	}

	

}
