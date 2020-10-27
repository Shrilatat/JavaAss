
public class Item extends Product {
	
	int warr;
	int cost;
	String manf;
	public Item(int proId,String desc,int warr,int cost,String manf)
	{
		super();
		this.warr=warr;
		this.cost=cost;
		this.manf=manf;
	}
	public void displayDetails() {
		System.out.println(super()+"Warr months "+ warr +" Cost is "+ cost + "Manufacturer is " + manf);
	}
}
