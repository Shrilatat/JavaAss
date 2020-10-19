package com.trg.eg;

public class Book {
	private int bookId,price;
	private String bookTitle,publicationHouse;
	Author auth;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getPublicationHouse() {
		return publicationHouse;
	}
	public void setPublicationHouse(String publicationHouse) {
		this.publicationHouse = publicationHouse;
	}
	public Author getAuth() {
		return auth;
	}
	public void setAuth(Author auth) {
		this.auth = auth;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", price=" + price + ", bookTitle=" + bookTitle + ", publicationHouse="
				+ publicationHouse + ", auth=" + auth + "]";
	}
	
	
	
	
	}
	


//<bean id="bk" class="com.trg.Book">
//<constructor-arg index="0"><value>1</value></constructor-arg>
//<constructor-arg index="1"><value>1000</value></constructor-arg>
//<constructor-arg index="2"><value>Java</value></constructor-arg>
//<constructor-arg index="3"><value>Sid</value></constructor-arg>
//<constructor-arg index="4"><value>Abc</value></constructor-arg>	
//</bean>

