package com.hsbc;


public class Book {
	
	int bID,Bprice;
	
	
	String bName,bAuthor,bPublication;
	public int getbID() {
		return bID;
	}
	public void setbID(int bID) {
		this.bID = bID;
	}
	public int getBprice() {
		return Bprice;
	}
	public void setBprice(int bprice) {
		Bprice = bprice;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbAuthor() {
		return bAuthor;
	}
	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}
	public String getbPublication() {
		return bPublication;
	}
	public void setbPublication(String bPublication) {
		this.bPublication = bPublication;
	}
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bID, String bAuthor,  String bPublication,String bName,int bprice) {
		super();
		this.bID = bID;
		Bprice = bprice;
		this.bName = bName;
		this.bAuthor = bAuthor;
		this.bPublication = bPublication;
	}

	
	@Override
	public String toString() {
		return "Book [bID=" + bID + ", Bprice=" + Bprice + ", bName=" + bName + ", bAuthor=" + bAuthor
				+ ", bPublication=" + bPublication + "]";
	}
}
