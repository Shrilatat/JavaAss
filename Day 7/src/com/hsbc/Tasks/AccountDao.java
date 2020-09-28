package com.hsbc.Tasks;

//Author : Amisha
//Date : 24/09/2020
//Purpose : Adds, removes and retrieves all accounts

import java.util.*;

public class AccountDao implements AccountDaoIntf {

	static List<Account> accounts = new LinkedList<>();

	public void addAccount(Account account) {
		accounts.add(account);
		System.out.println("Account added successfully.");

	}

	public void retrieveAllAccounts() {
		System.out.println("Displaying All Accounts => ");
		for (Account account : accounts)
			System.out.println(account);

	}

	public void deleteAccount(int accId) throws NoAccountException {
		int flag = 0;
		for (Iterator<Account> iterator = accounts.iterator(); iterator.hasNext();) {
			Account account = (Account) iterator.next();
			if (account.getAccId() == accId) {
				iterator.remove();
				System.out.println("Account with ID => " + accId + " was removed.");
				flag++;
			}
		}
		if (flag == 0) {
			throw new NoAccountException("Oopps! No Such Account with ID => " + accId + " existing to be removed.");
		}
	}

	public static void main(String[] args) {

//		Account obj1 = new SavingsAccount();
//		Account obj2 = new CurrentAccount();

		AccountDao obj3 = new AccountDao();

		System.out.println(
				"---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---");

		obj3.addAccount(new SavingsAccount(101, "Amisha", 7000.00, 500.00));
		obj3.addAccount(new SavingsAccount(102, "Durva", 5000.00, 500.00));
		obj3.addAccount(new SavingsAccount(103, "Shubhi", 6000.00, 500.00));
		obj3.addAccount(new CurrentAccount(201, "Saransh", 9000.00, 1000.00));
		obj3.addAccount(new CurrentAccount(202, "Mrigank", 8000.00, 1000.00));
		obj3.addAccount(new CurrentAccount(203, "Siddharth", 4000.00, 1000.00));

		System.out.println(
				"---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---");

		obj3.retrieveAllAccounts();

		System.out.println(
				"---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---");

		try {
			obj3.deleteAccount(102);
			obj3.deleteAccount(999);
		} catch (NoAccountException e) {
			e.printStackTrace();
		}

		System.out.println(
				"---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---x---");

	}
}
