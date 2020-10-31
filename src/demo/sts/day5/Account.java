package demo.sts.day5;

import java.util.Date;

public class Account {
	private int accountId;
	private String name, type;
	private double balance;
	private Date doj;
	private static int maxId = 0;
	public Account(String name, String type, double balance, Date doj) {
		this.name = name;
		this.type = type;
		this.balance = balance;
		this.doj = doj;
		this.accountId = ++maxId;
	}
	
	
	public int getAccountId() {
		return accountId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", name=" + name + ", type=" + type + ", balance=" + balance
				+ ", doj=" + doj + "]";
	}
	
	
}
