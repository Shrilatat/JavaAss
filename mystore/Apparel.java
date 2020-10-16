package mystore;

public class Apparel extends Goods {
	MATERIAL material;
	@Override
	public String toString() {
		return "Apparel [material=" + material + ", size=" + size + ", itemCode=" + itemCode + ", itemName=" + itemName
				+ ", itemPrice=" + itemPrice + ", quantity=" + quantity + "]";
	}


	SIZE size;

	public Apparel(int itemCode, String itemName, double itemPrice, int quantity, MATERIAL material, SIZE size) {
		super(itemCode, itemName, itemPrice, quantity);
		this.material = material;
		this.size = size;
	}


	public SIZE getSize() {
		return size;
	}
	public void setSize(SIZE size) {
		this.size = size;
	}
	public MATERIAL getMaterial() {
		return material;
	}


	public void setMaterial(MATERIAL material) {
		this.material = material;
	}


}
