package com.assign.acc;

import java.util.*;

public class AccountDao {
	
	static List<Account> accounts = new ArrayList<Account>();
	 
	public static void main(String[] args) {
		
		accounts.add(new CurrentAccount(101 , "aaa"));
		accounts.add(new CurrentAccount(102 , "bbb"));
		accounts.add(new SavingsAccount(103 , "ccc"));
		accounts.add(new SavingsAccount(104 , "ddd"));
		retrieveAllAccounts();
		addAccount();
		deleteAccount(101);
		
	}
	
	
	public static void retrieveAllAccounts() {
		System.out.println(accounts);
	}
	public static void addAccount() {
		System.out.println("After add");
		accounts.add(new SavingsAccount(105 , "eee"));
		System.out.println(accounts);
	}
	public static void deleteAccount(int accId) {
		System.out.println("After removal");
		accounts.remove(accId);
		System.out.println(accounts);
	}

}
