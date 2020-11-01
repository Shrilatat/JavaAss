package com.hsbc.collection_Assignment;

import java.util.Iterator;
import java.util.LinkedList;

public class CustmoerDao {

	private LinkedList<Customer> li = new LinkedList<>();
	
	
	
	public CustmoerDao() {
		super();
		Customer x = new Customer(101,92,"Raipur", "jacob", new Date(01,11,2020));
		Customer y = new Customer(101,92,"Raipur", "jacob", new Date(01,11,2020));
		Customer z = new Customer(101,92,"Raipur", "jacob", new Date(01,11,2020));
		li.add(x);
		li.add(y);
		li.add(z);
		//this.li = new LinkedList<>();
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
		cust.setContNo(newContNumber);
	}
	
	
	public void delete(int id) {
		
		Customer cust = getCustId(id);
		li.remove(cust);
	}
	
	public void displayAll() {
		
		for(Customer t : li) {
			System.out.println("  " + t.toString());
		}
	}
	
	public void dispCustbyId(int id) {
		Customer cust = getCustId(id);
		System.out.println(" " + cust) ;
	}
	
}
