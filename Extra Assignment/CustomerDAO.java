package com.demo;
import java.util.LinkedList;

public class CustomerDAO {
	private LinkedList<Customer> db = new LinkedList<>();

	public CustomerDAO() {}

	public CustomerDAO(LinkedList<Customer> db) {
		super();
		this.db = db;
	}

	public LinkedList<Customer> getDb() {
		return db;
	}

	public void insert(Customer c)
	{
		db.add(c);
	}
	
	public void update(int id, String newNo)
	{
		for(Customer c : db)
		{
			if(c.getCustID()==id)
				c.setContactNo(newNo);
		}
	}
	
	public void delete(int id)
	{
		for(Customer c : db)
		{
			if(c.getCustID()==id)
				db.remove(c);
		}
	}
	
	public void displayAll()
	{
		for(Customer c : db)
			System.out.println(c);
	}
	
	public void displayCustByID(int id)
	{
		for(Customer c : db)
		{
			if(c.getCustID()==id)
				System.out.println(c);
		}
	}
}
