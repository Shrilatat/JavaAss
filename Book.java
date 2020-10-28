
public class Book {
	private int bookno;
	private String title, author;
	private float price;


	public Book(int bookno, String title, String author, float price) {
		super();
		this.bookno = bookno;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public Book() {}

	public int getBookno() {
		return bookno;
	}

	public void setBookno(int bookno) {
		this.bookno = bookno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String toString() {
		return "Book [bookno=" + bookno + ", title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	public void incrPrice(double percentage) {
		this.price = price*(1+(float)percentage/100);
	}

}