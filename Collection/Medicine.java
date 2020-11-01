package Assday5;

public abstract class Medicine {
	private int price;
	private String date;
	
	public abstract void getDetails();
	public abstract void dispLabel();
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public Medicine(int price, String date) {
		super();
		this.price = price;
		this.date = date;
	}

	public String toString() {
		return " [price=" + price + ", date=" + date + "]";
	}
	
}