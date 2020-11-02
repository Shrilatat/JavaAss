import java.util.ArrayList;

public class HsbcTestEmpl {
	
	public static void main(String[] args) {
		HsbcEmpl e1 = new HsbcSalariedEmpl(1, 98989898, "Piyush", "Piyush@gmail.com", "Technology", "TSE", "28/09/2020",50000);
		HsbcEmpl e2 = new HsbcSalesEmpl(2, 98989898, "Deeyush", "Deeyush@gmail.com", "Operation", "TSE", "28/09/2020",500000);
		HsbcEmpl e3 = new HsbcContractEmpl(3, 98989898, "Yeeyush", "Yeeyush@gmail.com", "M&S", "TSE", "28/09/2020",8,4800);
		ArrayList<HsbcEmpl> emplDetails = new ArrayList<>();
		emplDetails.add(e1);
		emplDetails.add(e2);
		emplDetails.add(e3);
		System.out.println(emplDetails);
		emplDetails.get(0).calculateSalary();
	}
}
