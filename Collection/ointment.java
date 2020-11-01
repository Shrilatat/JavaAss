package Assday5;

public class ointment extends Medicine{
	
	public ointment(int price, String date) {
		super(price, date);
		
	}

	public void getDetails() {
		System.out.println("For External use Only.");	
	}

	public void dispLabel() {
		System.out.println("Ointment " + super.toString());		
	}
}
