package demo.sts.day5;

import java.util.Date;

public abstract class Medicine {
	private float price;
	private Date expiryDate;
	
	public abstract String displayLabel();

	public Medicine(float price, Date expiryDate) {
		this.price = price;
		this.expiryDate = expiryDate;
	}

	public float getPrice() {
		return this.price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getDetails() {
		return "Medicine [Price=" + price + ", expiryDate=" + expiryDate + "]";
	}
}
