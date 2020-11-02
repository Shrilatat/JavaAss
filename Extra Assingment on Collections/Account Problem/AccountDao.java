package com.HSBCAccount;

import java.util.ArrayList;

public class AccountDao implements AccountDaoIntr {
	private ArrayList<Account> acc = new ArrayList<Account>();
	
	public void addAccount(Account a) {
		if(acc.contains(a)) {
			System.out.println("Account already exists");
		}else {
			acc.add(a);
		}
	}
	public void closeAccount(Account a) {
		if(acc.contains(a)) {
			acc.remove(a);
		}else {
			System.out.println("Account doesn't exists");
		}
		
	}
	public void debitAccount(Account a, double amount) {
		if(acc.contains(a)) {
			if(a.getBalance()>amount) {
				double bal=a.getBalance();
				a.setBalance(bal-amount);
			}else {
				System.out.println("Insufficient balance");
			}
		}else {
			System.out.println("Account does't exists");
		}
	}
	public void creditAccount(Account a, double amt) {
		if(acc.contains(a)) {
			double bal = a.getBalance();
			a.setBalance(bal+amt);
		}else {
			System.out.println("Balance doesn't exists");
		}
	}
	public void showBalance(int accid) {
		for(Account a: acc) {
			if(a.getId()==accid) {
				System.out.println("Your current balance is: "+a.getBalance());
				break;
			}
		}
	}
	public ArrayList<Account> getAcc() {
		return acc;
	}
	public void setAcc(ArrayList<Account> acc) {
		this.acc = acc;
	}
	@Override
	public String toString() {
		return "AccountDao [acc=" + acc + "]";
	}
	
}
