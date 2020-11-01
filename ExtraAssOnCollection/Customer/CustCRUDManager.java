package com.hsbc.collection_Assignment;

import java.util.Scanner;

public class CustCRUDManager {

	public static void main(String[] args) {
		
	
	int flag =1;
	
	
	Scanner sc = new Scanner(System.in);
			
			CustmoerDao c = new CustmoerDao();

			System.out.println("Enter 1 for adding new Customer details");
			System.out.println("Enter 2 for updating Customer details");
			System.out.println("Enter 3 for deleting Customer record ");
			System.out.println("Enter 4 for viewing all Customer details");
			System.out.println("Enter 5 to exit");
			
			int value = sc.nextInt();
	
			while(flag>0) {
				switch(value) {
					case 0:
						System.out.println("Enter 1 for adding new Customer details");
						System.out.println("Enter 2 for updating Customer details");
						System.out.println("Enter 3 for deleting Customer record");
						System.out.println("Enter 4 for viewing all Customer details");
						System.out.println("Enter 5 to exit");
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


	
