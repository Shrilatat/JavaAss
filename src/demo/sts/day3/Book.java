package demo.sts.day3;

public class Book {
	private int bookId;
	private String bName, author;
	private double price;
	private static int maxId = 0;
	
	public Book(String bName, String author, double price) {
		this.bookId = ++maxId;
		this.bName = bName;
		this.author = author;
		this.setPrice(price);
	}
	
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
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

	public int getId() {
		return this.bookId;
	}
	
	public void setPrice(double price) {
		if (price < 0) {
			this.price = 0;
			System.out.println("Price Cannot be less than 0!");
		}
		else this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bName=" + bName + ", author=" + author + ", price=" + price + "]";
	}

	
}
