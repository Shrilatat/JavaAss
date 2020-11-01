package Assday5;

public class testMedicine {
	public static void main(String[] args) {
		Medicine A = new Tablet(100, "10-10-10");
		Medicine B = new Syrup(100, "10-10-10");
		Medicine C = new ointment(100, "10-10-10");
		
		Medicine[] med = {A,B,C};
		
		for(Medicine a : med) {
			a.dispLabel();
			a.getDetails();
		}
	}
}
