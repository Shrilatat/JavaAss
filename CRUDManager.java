package com.TrackingCustomerDetails;

import java.sql.Date;
import java.util.Scanner;

public class CRUDManager {

	public static void main(String[] args) {


		int flag =1;


		Scanner sc = new Scanner(System.in);

		CustomerDao c = new CustomerDao();

		System.out.println("Enter 1 : Add new Customer details");
		System.out.println("Enter 2 : Update Customer details");
		System.out.println("Enter 3 : Deleting Customer record ");
		System.out.println("Enter 4 : View all Customer details");
		System.out.println("Enter 5 : Exit");

		System.out.println("Enter your option : ");
		int value = sc.nextInt();

		while(flag>0) {
			switch(value) {
				case 0:
					System.out.println("Enter 1 : Add new Customer details");
					System.out.println("Enter 2 : Update Customer details");
					System.out.println("Enter 3 : Deleting Customer record");
					System.out.println("Enter 4 : View all Customer details");
					System.out.println("Enter 5 : Exit");
					value = sc.nextInt();
					break;
				case 1:
					System.out.println("Enter ID:");
					int id = sc.nextInt();
					System.out.println("Enter Name");
					String name = sc.next();
					System.out.println("Enter contact No.");
					int phNo = sc.nextInt();
					System.out.println("Enter Address.");
					String address = sc.next();
					System.out.println("Enter DOB date.");
					int day = sc.nextInt();
					System.out.println("Enter DOB month.");
					int month = sc.nextInt();
					System.out.println("Enter DOB year.");
					int year = sc.nextInt();
					c.insert(new Customer(id,phNo,address,name,new Date(day,month,year)));
					value = 0;
					break;
				case 2:
					System.out.println("Enter ID:");
					int id2 = sc.nextInt();
					System.out.println("Enter PhoneNo.");
					int phNo2 = sc.nextInt();		
					c.update(id2, phNo2);
					value=0;
					break;
				case 3:
					System.out.println("Enter ID:");
					int id3 = sc.nextInt();
					c.delete(id3);
					value = 0;
					break;
				case 4:
					c.displayAll();
					value = 0;
					break;
				case 5:
					flag=0;
					break;
			}
		}
		System.out.println("Thank you");

		sc.close();
	}
}
