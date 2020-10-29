package demo;

public class Book {

	private int bookId;
	private String bname;
	private String author;
	private double price;
	public Book() {
		super();
	}
	public Book(int bookId, String bname, String author, double price) {
		super();
		this.bookId = bookId;
		this.bname = bname;
		this.author = author;
		this.price = price;
	}
	
	public int getbookId() {
		return bookId;
	}
	
	public String getauthorname() {
		return author;
	}
	public String getbookname() {
		return bname;
	}

	public double getPrice()
	{
		return price;
	}
	public void setbookId(int bookId) {
		this.bookId=bookId;
	}

	public void setauthorname(String author) {
		this.author=author;
	}
	public void setbookname(String bname) {
		this.bname=bname;
	}
	public void setprice(double price) {
		this.price=price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bname=" + bname + ", author=" + author + ", price=" + price + "]";
	}

	
}
