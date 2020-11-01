package com.hsbc.collection_Assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class AccountDao implements AccountDaoIntf {

	ArrayList<Account>accountlist;
	
	public AccountDao() {
		super();
		this.accountlist = new ArrayList<>();
	}
	
	
	public void addAccount(Account a) {
		
		accountlist.add(a);
	}

	
	public void closeAccount(Account b) {
		
		accountlist.remove(b);
	}

	
	public void debitAccount(Account a, int amount) {
		
		if(a.getBal() >= 5000)
			a.setBal(a.getBal() - amount);
		else
			System.out.println("Insufficient balance");
	}

	
	public void creditAccount(Account a, int amt) {
		
		a.setBal(a.getBal() + amt);
	}

	
	public double showBalance(int id) {
		
		Iterator<Account> it = accountlist.iterator();
		while (it.hasNext()) {
			Account acc = it.next();
			if (acc.getId() == id)
				return acc.getBal();
		}
		return 0.0;
		/*for(Account t : accountlist)
		{
			if(t.getId()  == id)
				return t.getBal();
			
		}

		return 0.0;*/
	}

}
