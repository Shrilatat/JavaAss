package com.assign3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import com.assign1.Date;

public class CustomerDAO {
	Customer c1= new Customer(01, "Customer1", 1, "Address1",new Date(22,1,1999));
	Customer c2= new Customer(02, "Customer2", 2, "Address2",new Date(13,2,1997));
	Customer c3= new Customer(03, "Customer3", 3, "Address3",new Date(25,8,1994));
	Customer c4= new Customer(04, "Customer4", 4, "Address4",new Date(12,12,1996));
	Customer c5= new Customer(05, "Customer5", 5, "Address5",new Date(2,10,1998));
	
	List<Customer> list= new LinkedList<Customer>(Arrays.asList(c1,c2,c3,c4,c5));
	
	public void insert(Customer c) {
		list.add(c);
	}
	
	public void update(int id, int newcontactno) {
		for(Customer c: list) {
			if(c.getCustid()==id)
				c.setContactno(newcontactno);
		}
	}
	
	public void delete(int id) {
		for(Customer c: list) {
			if(c.getCustid()==id)
				list.remove(c);
		}
	}
	
	public void displayAll() {
		for(Customer c: list)
			System.out.println(c.displayDetails());;
	}
	
	public void displayCustbyId(int id) {
		for(Customer c: list) {
			if(c.getCustid()==id)
				System.out.println(c.displayDetails());
		}
	}

}
