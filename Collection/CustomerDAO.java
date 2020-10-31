package Assday5;

import java.util.LinkedList;

public class CustomerDAO {
	
	LinkedList<Customer> cust = new LinkedList<>();
	int cid = 0;
	
	void inset(Customer c) {
		cust.add(c);
		cid += 1;
	}
	void update(int id, String mob) {
		for (Customer a : cust) {
			if(a.getCid() == id)
				a.setMob(mob);
		}
		System.out.println("Updated Record");
		displaybycid(id);
	}
	void delete(int id) {
		for (Customer a : cust) {
			if((a.getCid() == id) && (id != 1))
				cust.remove(a);
		}
		if (id == 1)
			cust.removeFirst();
		System.out.println("After Deleting");
		displayall();
	}
	void displayall() {
		for (Customer a : cust)
			System.out.println(a.toString());
	}
	void displaybycid(int id) {
		for (Customer a : cust) {
			if(a.getCid() == id)
				System.out.println(a.toString());
		}		
	}


}
