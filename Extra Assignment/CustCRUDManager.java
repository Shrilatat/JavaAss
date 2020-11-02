package com.demo;
import java.util.*;
public class CustCRUDManager {
	public static void main(String[] args) {
		
		CustomerDAO cust = new CustomerDAO();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1: for adding new customer details");
		System.out.println("2: for updating customer details");
		System.out.println("3: for deleting customer record");
		System.out.println("4: for displaying all customer details");
		System.out.println("5: for exiting the menu");
		
		int ID = 100;
		
		while(true)
		{
			System.out.println("Select an option from above:");
			int n = sc.nextInt();
			
			if(n==1)
			{
				ID++;
				System.out.println("enter customer name:");
				String name = sc.next();
				System.out.println("enter contact no:");
				String no = sc.next();
				System.out.println("enter address:");
				String add = sc.next();
				System.out.println("enter date of birth:");
				int d = sc.nextInt();
				System.out.println("enter month of birth");
				int m = sc.nextInt();
				System.out.println("enter year of birth");
				int y = sc.nextInt();
				cust.insert(new Customer(ID,name,no,add,new Date(d,m,y)));
			}
			else if(n==2)
			{
				System.out.println("enter customer id:");
				int id = sc.nextInt();
				System.out.println("enter new contact no:");
				String no = sc.next();
				cust.update(id, no);
			}
			else if(n==3)
			{
				System.out.println("enter customer id:");
				int id = sc.nextInt();
				cust.delete(id);
			}
			else if (n==4)
			{
				System.out.println("all records:");
				cust.displayAll();
			}
			else
			{
				System.out.println("Thank you!");
				break;
			}
				
		}
	}
}
