package mystore;

public class Electronics extends Goods {
	int warranty;

	public Electronics(int itemCode, String itemName, double itemPrice, int quantity, int warranty) {
		super(itemCode, itemName, itemPrice, quantity);
		this.warranty = warranty;
	}

	public int getWarranty() {
		return warranty;
	}

	@Override
	public String toString() {
		return "Electronics [warranty=" + warranty + ", itemCode=" + itemCode + ", itemName=" + itemName
				+ ", itemPrice=" + itemPrice + ", quantity=" + quantity + "]";
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
}
