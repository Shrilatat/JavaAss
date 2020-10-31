package Assday5;

import java.util.ArrayList;

public class accdao implements accdaoinf {
	
	ArrayList<account> accountlist = new ArrayList<>() ;
	int id = 0;
	
	public void addac(account a) {
		accountlist.add(a);
		id = id+1;
	}
	public void closeacc(account a) {
		accountlist.remove(a);
		System.out.println(accountlist);
	}
	public void withdraw(account a, double amount) {
		if ((a.getBalance()-amount) > 5000) {
			System.out.println("Amount Withdrawn");
			a.setBalance(a.getBalance()-amount);
			System.out.println("Upadted Balance : " + a.getBalance());
		} else
			System.out.println("Cannot Withdraw");
	}
	
	public void deposite(account a, double amount) {
		a.setBalance(a.getBalance() + amount);
		System.out.println("Amount Deposited");
		System.out.println("Upadted Balance : " + a.getBalance());
	}
	public void checkbalance(int acc_id) {
		for (account a : accountlist)
			if (a.getAcc_id() == acc_id) {
				System.out.println(a.getBalance());
			}
	}
}
