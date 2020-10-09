package com.hsbc.modelaccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class AccountDao {
	List<Account> list = new ArrayList();

	public AccountDao() {
		list.add(new CurrAccount(3, "Current", 1200.0, 50.0));
		list.add(new CurrAccount(4, "Current", 1400.0, 100.0));
		list.add(new SavingAccount(1, "Saving", 1000.0, 150.0));
		list.add(new SavingAccount(2, "Saving", 1500.0, 180.0));

	}

	public void retrieveAllAccounts() throws NoAccountFoundException {
		Iterator iterator = list.iterator();
		if (iterator.hasNext() == false) {
			throw new NoAccountFoundException("No account can be found!");
		} else {
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}
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
				list.add(new SavingAccount(account.getAccId(), account.getAccName(), 500.0, 100.0));
			} else if (account.getAccName().equals("Current")) {
				list.add(new CurrAccount(account.getAccId(), account.getAccName(), 500.0, 80.0));
			}
		}
	}

	public void deleteAccount(int acctId) throws NoAccountFoundException {
		Iterator<Account> iterator = list.iterator();
		if (iterator.hasNext() == false) {
			throw new NoAccountFoundException("No account can be found!");
		}
		while (iterator.hasNext()) {
			Account a = iterator.next();
			if (a.getAccId() == acctId) {
				iterator.remove();
			}
		}
	}
}