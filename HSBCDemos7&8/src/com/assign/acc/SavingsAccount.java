package com.assign.acc;

public class SavingsAccount extends Account {
	int minBal , bal; 
	public SavingsAccount(int accId, String accName) {
		super(accId, accName);
		
	}

	public int getMinBal() {
		return minBal;
	}

	public void setMinBal(int minBal) {
		this.minBal = minBal;
	}

	public int getBal() {
		return bal;
	}

	public void setBal(int bal) {
		this.bal = bal;
	}

	

}
