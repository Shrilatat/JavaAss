package com.demo;

import java.util.ArrayList;

public class AccDao implements AccDaoIntf {

	private ArrayList<Account> accDB = new ArrayList<>();
	
	public AccDao() {}

	public AccDao(ArrayList<Account> accDB) {
		super();
		this.accDB = accDB;
	}
	
	public ArrayList<Account> getAccDB() {
		return accDB;
	}

	public void addAcc(Account a)
	{
		accDB.add(a);
	}
	public void closeAcc(Account a)
	{
		accDB.remove(a);
	}
	public void debitAcc(Account a, double amt)
	{
		double bal = a.getBalance();
		if((bal-amt)>=5000)
			a.setBalance(bal-amt);
		else
			System.out.println("insuff balance");
	}
	public void creditAcc(Account a, double amt)
	{
		double bal = a.getBalance();
		a.setBalance(bal+amt);
	}
	public void showBal(int accID)
	{
		for(Account a : accDB)
		{
			if(a.getId()==accID)
              System.out.println("Balance: "+a.getBalance());
		}
	}
}
