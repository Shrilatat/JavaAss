package Assday5;

public class Tablet extends Medicine{
	
	public Tablet(int price, String date) {
		super(price, date);
		
	}

	public void getDetails() {
		System.out.println("Store in cool and dry place.");	
	}

	public void dispLabel() {
		System.out.println("Tablet " + super.toString());		
	}
}
