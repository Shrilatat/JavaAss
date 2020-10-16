package com.hsbc.spring;

public class BookBean {

	private int bookid;
	private String bookTitle;
	private int isbnno;
	private String publication;

	AuthorBean authorbean;

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public int getIsbnno() {
		return isbnno;
	}

	public void setIsbnno(int isbnno) {
		this.isbnno = isbnno;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public AuthorBean getAuthorbean() {
		return authorbean;
	}

	public void setAuthorbean(AuthorBean authorbean) {
		this.authorbean = authorbean;
	}

	@Override
	public String toString() {
		return "BookBean [bookid=" + bookid + ", bookTitle=" + bookTitle + ", isbnno=" + isbnno + ", publication="
				+ publication + ", authorbean=" + authorbean + "]";
	}

}
