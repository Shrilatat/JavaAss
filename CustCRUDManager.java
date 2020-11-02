package com.assign3;

import java.util.Scanner;

import com.assign1.Date;
import com.assign1.DateException;

public class CustCRUDManager {
	public void Menu() {
		System.out.println("1. Insert new Customer details");
		System.out.println("2. Update Customer details");
		System.out.println("3. Delete Customer record");
		System.out.println("4. Display all customer details");
		System.out.println("5. Exit");
	}
	
	public static void main(String[] args) {
		CustCRUDManager CM= new CustCRUDManager();
		Customer c=new Customer();
		Date date=new Date();
		Scanner obj= new Scanner(System.in);
		CustomerDAO cd=new CustomerDAO();
		CM.Menu();
		Integer o=0;
		while(o!=5){
			System.out.println("Enter Option:");
			o=obj.nextInt();
			switch(o)
			{
				case 1:
					System.out.println("Enter Customer Id:"); 
					Integer id=obj.nextInt();
					c.setCustid(id);;
					System.out.println("Enter Customer Name:");
					String name=obj.next();
					c.setCustname(name);
					System.out.println("Enter phone no:");
					Integer phn=obj.nextInt();
					c.setContactno(phn);
					System.out.println("Enter Address:");
					String address=obj.next();
					c.setAddress(address);
					System.out.println("Enter Day of birth:");
					Integer cday=obj.nextInt();
				try {
					date.setIntDay(cday);
				} catch (DateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					System.out.println("Enter Month:");
					Integer cmonth=obj.nextInt();
					date.setIntMonth(cmonth);
					System.out.println("Enter Year:");
					Integer cyear=obj.nextInt();
					date.setIntYear(cyear);
					c.setDob(date);
					cd.insert(c);
					break;
					
				case 2:
					System.out.println("Enter Account Id:");
					Integer id2=obj.nextInt();
					System.out.println("Enter new Contact number:");
					Integer phn2=obj.nextInt();
					cd.update(id2, phn2);
					break;
					
				case 3:
					System.out.println("Enter Account Id:");
					Integer id3=obj.nextInt();
					cd.delete(id3);
					break;
				
				case 4:
					cd.displayAll();
					break;
					
				default:
					return;
	 		}
		}
	}
}
	
