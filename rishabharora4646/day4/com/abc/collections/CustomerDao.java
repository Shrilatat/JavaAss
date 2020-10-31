package com.abc.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CustomerDao {
	 private List<Customer> customers= new LinkedList<>();
	 
	 public CustomerDao() {
		 customers.add(new Customer(1,"abc","98774384777","email@email.com","address_1",new dateclass(6,10,2020)));
		 customers.add(new Customer(2,"dabc","+2877777","email2@email.com","address_2",new dateclass(1,2,2020)));
		 customers.add(new Customer(3,"aebc","879877777","email3@email.com","address_3",new dateclass(6,1,2020)));
		 customers.add(new Customer(4,"fabc","+39877777","email4@email.com","address_4",new dateclass(10,10,2020)));
		 customers.add(new Customer(5,"faffbc","+69877777","ema5il@email.com","address551",new dateclass(15,10,2020)));
		 customers.add(new Customer(6,"ffabfsac","9877777","emai5l@email.com","address_531",new dateclass(23,7,2020)));
	 }
	 
	 public void insert(Customer c) {
		 customers.add(c);
	 }
	 
	 public void update(int id, String contactNo) {
		 for (Customer c: customers) {
			 if (c.getId() == id)
				 c.setPhNo(contactNo);
		 }
	 }
	 
	 public void delete(int id) {
		Iterator<Customer> it = this.customers.iterator();
			while(it.hasNext()) {
				Customer b = it.next();
				if (b.getId() == id)
					it.remove();			
			}		 
	 }
	 
	 public void display() {
		 for (Customer c: customers) {
			 System.out.println(c);
		 }
	 }
	 
	 public void displayCustById(int id) {
		 for (Customer c: customers) {
			 if (c.getId() == id)
				 System.out.println(c);
		 }		 
	 }
}
