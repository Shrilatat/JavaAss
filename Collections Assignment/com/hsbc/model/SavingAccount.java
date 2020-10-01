package com.hsbc.model;

import com.hsbc.dao.Account;

public class SavingAccount extends Account {

	double minBal;
	double bal;
	
	public double getMinBal() {
		return minBal;
	}
	public void setMinBal(double minBal) {
		this.minBal = minBal;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public SavingAccount() {
	}
	

	public SavingAccount(int accId, String accName,double minBal,double bal) {
		super(accId, accName);
		this.minBal=minBal;
		this.bal=bal;
	}
	@Override
	public String toString() {
		return "SavingAccount [minBal=" + minBal + ", bal=" + bal + ", accId=" + accId + ", accName=" + accName + "]";
	}
	
	
	
}
