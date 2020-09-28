package mystore;

import java.util.Date;

public class FoodItem extends Goods {
	Date dateOfMan;
	Date dateOfExp;
	boolean veg;

	public FoodItem(int itemCode, String itemName, double itemPrice, int quantity, Date dateOfMan, Date dateOfExp) {
		super(itemCode, itemName, itemPrice, quantity);
		this.dateOfMan = dateOfMan;
		this.dateOfExp = dateOfExp;
	}

	public Date getDateOfMan() {
		return dateOfMan;
	}

	public void setDateOfMan(Date dateOfMan) {
		this.dateOfMan = dateOfMan;
	}

	public Date getDateOfExp() {
		return dateOfExp;
	}

	public void setDateOfExp(Date dateOfExp) {
		this.dateOfExp = dateOfExp;
	}

	@Override
	public String toString() {
		return "FoodItem [dateOfMan=" + dateOfMan + ", dateOfExp=" + dateOfExp + ", veg=" + veg + ", itemCode="
				+ itemCode + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", quantity=" + quantity + "]";
	}

	public boolean isVeg() {
		return veg;
	}

	public void setVeg(boolean veg) {
		this.veg = veg;
	}

}
