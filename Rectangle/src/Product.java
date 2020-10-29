
public class Product {

	int proId;
	String desc;
//	public Product(int proId,String desc) {
//		this
//	}
	public Product() {}
	public Product(int proId, String desc) {
		super();
		this.proId = proId;
		this.desc = desc;
	}

	public void displayDetails()
	{
		System.out.println("ProductID"+proId+"Description"+desc);
	}
	public static void main(String[] args)
	{
		Product P=new Product;
		
	}
}
