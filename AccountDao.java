package com.Account;

import java.util.ArrayList;
import java.util.Iterator;

public class AccountDao implements AccountDaoInf{

	ArrayList<Account> accList;

	public AccountDao() {
		super();
		this.accList = new ArrayList<>();
	}

	public void addAccount(Account a) {
		accList.add(a);	
	}

	public void closeAccount(Account b) {
		Iterator<Account> it = accList.iterator();
		while(it.hasNext()) {
			if(it.next().getId() == b.getId()) {
				it.remove();
			}
		}
		
	}

	public void debitAccount(Account a, int amount) {
		if(a.getBalance() >= 5000) {
			a.setBalance(a.getBalance() - amount);
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}

	public void creditAccount(Account a, int amount) {
		a.setBalance(a.getBalance() + amount);	
	}

	public double showBalance(int id) {
		Iterator<Account> it = accList.iterator();
		while(it.hasNext()) {
			Account acc = it.next();
			if(acc.getId() == id) {
				return acc.getBalance();
			}
		}
		return 0;
	}
	
}
