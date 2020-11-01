
public class Book {
		
	private int bookId;
	private String bName;
	private String author;
	private double price;
	
	public Book() {
	}

	public Book(int bookId, String bName, String author, double price) {
		super();
		this.bookId = bookId;
		this.bName = bName;
		this.author = author;
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
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

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bName=" + bName + ", author=" + author + ", price=" + price + "]";
	}
	
	
	
}
