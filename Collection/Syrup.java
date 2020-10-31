package Assday5;

public class Syrup extends Medicine{
	
	public Syrup(int price, String date) {
		super(price, date);
		
	}

	public void getDetails() {
		System.out.println("Take twice a day.");	
	}

	public void dispLabel() {
		System.out.println("Syrup " + super.toString());		
	}
}
