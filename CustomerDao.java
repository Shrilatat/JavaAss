package com.TrackingCustomerDetails;

import java.sql.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class CustomerDao {

	private LinkedList<Customer> li = new LinkedList<>();

	public CustomerDao() {
		super();
		Customer x = new Customer(101,92,"Raipur", "jacob", new Date(01,11,2020));
		Customer y = new Customer(102,93,"Ranchi", "andrew", new Date(11,12,2000));
		Customer z = new Customer(103,94,"Delhi", "lily", new Date(20,11,2010));
		li.add(x);
		li.add(y);
		li.add(z);
	}

	public void insert (Customer c)
	{
		li.add(c);
	}

	public Customer getCustId(int id ) {

		Iterator<Customer> t = li.iterator();

		while(t.hasNext()) {
			Customer cust = t.next();
			if(cust.getCustId() == id )
			return cust;
		}
		return null;
	}

	public void update (int id,int newContNumber)
	{
		Customer cust = getCustId(id);
		cust.setCustNo(newContNumber);
	}

	public void delete(int id) {
		Customer cust = getCustId(id);
		li.remove(cust);
	}

	public void displayAll() {
		for(Customer t : li) {
			System.out.println("  ");
			t.displayDetails();
		}
	}

	public void dispCustbyId(int id) {
		Customer cust = getCustId(id);
		System.out.println(" " + cust) ;
	}

}
