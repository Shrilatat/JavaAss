package JavaAss;

public class Book {

	private int bookNo;
	private String title;
	private String auth;
	private int price;
	
	
	public Book(int bookNo, String title, String auth, int price) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.auth = auth;
		this.price = price;
	}
	
	public void incrPrice(double per) {
	int	newprice =(int) (price*(1+per/100));
	setPrice(newprice);
	}
	
	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", title=" + title + ", auth=" + auth + ", price=" + price + "]";
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuth() {
		return auth;
	}
	public void setAuth(String auth) {
		this.auth = auth;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
