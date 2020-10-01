package com.hsbc.assignment7;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class AccountDao {
	List<Account> list = new ArrayList();

	public AccountDao() {
		list.add(new CurrentAccount(1, "Current", 4000, 100));
		list.add(new CurrentAccount(2, "Current", 5000, 200));
		list.add(new SavingAccount(3, "Saving", 6000, 200));
		list.add(new SavingAccount(4, "Saving", 7000, 300));
		
	}

	public void retrieveAllAccounts()  {
			for (Account account : list) {
				System.out.println(account);
			}
			System.out.println("------");
	}

	public void addAccount(Account account) {
		int count = 0;
		Iterator<Account> iterator = list.iterator();
		while (iterator.hasNext()) {
			Account a = iterator.next();
			if (account.getAccId() == a.getAccId()) {
				count++;
			}
		}
		if (count == 0) {
			if (account.getAccName().equals("Saving")) {
				list.add(new SavingAccount(account.getAccId(), account.getAccName(), 10000, 800));
			} else if (account.getAccName().equals("Current")) {
				list.add(new CurrentAccount(account.getAccId(), account.getAccName(), 12000, 1000));
			}
		}
	}

	public void deleteAccount(int acctId)  {
		Iterator<Account> iterator = list.iterator();
	
		while (iterator.hasNext()) {
			Account a = iterator.next();
			if (a.getAccId() == acctId) {
				iterator.remove();
			}
		}
	}
}