package Assday5;

import java.util.Scanner;

public class custcurdmanager {
	
	public static void main(String[] args) {
		
		Customer A = new Customer(1, "Aayush", "Punjab", "10-08-1998", "9988776655");
		Customer B = new Customer(2, "Aman", "Haryana", "11-08-1998", "9876543210");
		Customer C = new Customer(3, "Kamal", "Gujrat", "12-08-1998", "9874562130");

		CustomerDAO record = new CustomerDAO();
		record.inset(A);
		record.inset(B);
		record.inset(C);		
		Scanner s = new Scanner(System.in);
		int n = 1;
		while (n>0 && n<5) {
			System.out.println("Option 1 - Add Cust");
			System.out.println("Option 2 - Update Cust");
			System.out.println("Option 3 - Delete Cust");
			System.out.println("Option 4 - Disp All");
			System.out.println("Option 5 - Exit");
			System.out.println("Enter Option Number");
			n = Integer.parseInt(s.next());
			if (n == 1) {
				System.out.println("Enter Name");
				String name = s.next();
				System.out.println("Enter Address");
				String address = s.next();
				System.out.println("Enter DOB");
				String dob = s.next();
				System.out.println("Enter Phone Number");
				String mob = s.next();
				int id = record.cid + 1;
				Customer temp = new Customer(id, name, address, dob, mob);
				record.inset(temp);
			}else if (n==2) {
				System.out.println("Enter Cid");
				int id = Integer.parseInt(s.next());
				System.out.println("Enter Phone Number");
				String mob = s.next();
				record.update(id, mob);
			}else if (n==3) {
				System.out.println("Enter Cid");
				int id = Integer.parseInt(s.next());
				record.delete(id);
			} else if (n==4) {
				record.displayall();
			}
		}	
		s.close();	
	}

}
