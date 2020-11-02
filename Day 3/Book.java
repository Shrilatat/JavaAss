
public class Book {
	private int bookid;
	private String bname;
	private String author;
	private double price;
	
	public Book()
	{
		bookid=0;
		bname="NA";
		author="NA";
		price=0;
	}

	public Book(int bookid, String bname, String author, double price) {
		super();
		this.bookid = bookid;
		this.bname = bname;
		this.author = author;
		this.price = price;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
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

	public String toString() {
		return "Book [bookid=" + bookid + ", bname=" + bname + ", author=" + author + ", price=" + price + "]";
	}
	
}
