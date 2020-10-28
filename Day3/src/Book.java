
public class Book {
	private int bookID;
	private String bname, author;
	private double price;
	
	public Book() {
	
	}

	public Book(int bookID, String bname, String author, double price) {
		super();
		this.bookID = bookID;
		this.bname = bname;
		this.author = author;
		this.price = price;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
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

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", BookName=" + bname + ", Author=" + author + ", Price=" + price + "]";
	}
    
	
	
	
}
