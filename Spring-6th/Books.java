package com.hsbc;

public class Books {

	int bookID;
	String bookAuthor, bookPublication;

	public int getbookID() {
		return bookID;
	}

	public void setbookID(int bookID) {
		this.bookID = bookID;
	}

	public String getbookAuthor() {
		return bookAuthor;
	}

	public void setbookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getbookPublication() {
		return bookPublication;
	}

	public void setbookPublication(String bookPublication) {
		this.bookPublic = bookPublication;
	}

	@Override
	public String toString() {
		return "Books [bookID=" + bookID + ", bookAuthor=" + bookAuthor + ", bookPublication=" + bPublication + "]";
	}

}
