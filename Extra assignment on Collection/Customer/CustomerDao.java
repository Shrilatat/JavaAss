package com.hsbc.AssignCollect;

import java.util.LinkedList;
import java.util.List;

public class CustomerDao {
	
	private List<Customer> Cust = new LinkedList<Customer>();
	
	public void insert(Customer c)
	{
		Cust.add(c);
	}
	
	public void update(int id , int contNo)
	{
		for(Customer c : Cust)
		{
			if(c.getCustId()==id)
			{
				c.setContNo(contNo);
				break ;
			}
		}
	}
	
	void delete(int id)
	{
		for(Customer c : Cust)
		{
			if(c.getCustId()==id)
			{
				Cust.remove(c);
			}
		}
	}
	
	void displayAll()
	{
		for(Customer c : Cust)
		{
			System.out.println(c);
		}
	}
	
	void displayById(int id)
	{
		for(Customer c : Cust)
		{
			if(c.getCustId()==id)
			{
				System.out.println(c);
				break ;
			}
		}
	}
	

}
