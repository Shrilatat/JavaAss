package com.hsbc.model;

public class SavingsAccount extends Account {
	
	private float minBal;
	private float bal;
	public SavingsAccount(int accId, String accName, float minBal, float bal) {
		super(accId, accName);
		this.minBal = minBal;
		this.bal = bal;
	}
	public float getMinBal() {
		return minBal;
	}
	public void setMinBal(float minBal) {
		this.minBal = minBal;
	}
	public float getBal() {
		return bal;
	}
	public void setBal(float bal) {
		this.bal = bal;
	}
	

}
