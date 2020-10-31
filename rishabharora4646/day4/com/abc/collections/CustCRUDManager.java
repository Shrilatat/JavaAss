package com.abc.collections;

import java.util.Scanner;

public class CustCRUDManager {
	public static void main(String[] args) {
		
		CustomerDao c1 = new CustomerDao();
		
		System.out.println("1. Join Customer.");
		System.out.println("2. Update Customer.");
		System.out.println("3. Delete Customer.");
		System.out.println("4. Display All Customers.");
		System.out.println("5. Exit.");
		
		Scanner sc = new Scanner(System.in);
		
		int option = sc.nextInt();
		boolean state  = true;
		while(state) {
			switch(option) {
				case 0:
					System.out.println("1. Join Customer.");
					System.out.println("2. Update Customer.");
					System.out.println("3. Delete Customer.");
					System.out.println("4. Display All Customers.");
					System.out.println("5. Exit.");
					option = sc.nextInt();
					break;
				case 1:
					System.out.println("Enter ID:");
					int id = sc.nextInt();
					System.out.println("Enter Name");
					String name = sc.next();
					System.out.println("Enter PhoneNo.");
					String phNo = sc.next();
					System.out.println("Enter Email:");
					String email = sc.next();
					System.out.println("Enter Address.");
					String address = sc.next();
					System.out.println("Enter DOB date.");
					int day = sc.nextInt();
					System.out.println("Enter DOB month.");
					int month = sc.nextInt();
					System.out.println("Enter DOB year.");
					int year = sc.nextInt();
					c1.insert(new Customer(id,name,phNo,email,address,new dateclass(day,month,year)));
					option = 0;
					break;
				case 2:
					System.out.println("Enter ID:");
					int id2 = sc.nextInt();
					System.out.println("Enter PhoneNo.");
					String phNo2 = sc.next();		
					c1.update(id2, phNo2);
					option=0;
					break;
				case 3:
					System.out.println("Enter ID:");
					int id3 = sc.nextInt();
					c1.delete(id3);
					option = 0;
					break;
				case 4:
					c1.display();
					option = 0;
					break;
				case 5:
					state=false;
					break;
			}
		}
		System.out.println("exited.");
	}
	
}
