package com.hsbc.assignment7;

public class CurrentAccount extends Account {
	double bal;
	double overdraftAmt;
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public double getOverdraftAmt() {
		return overdraftAmt;
	}
	
	public void setOverdraftAmt(double overdraftAmt) {
		this.overdraftAmt = overdraftAmt;
	}
	
	/**
	 * 
	 */
	public CurrentAccount() {
		super();
	}
	
	
	
	public CurrentAccount(int acId, String name,double bal, double overdraftAmt) {
		super(acId,name);
		this.bal = bal;
		this.overdraftAmt = overdraftAmt;
	}
	public String toString() {
		return "CurrAccount [bal=" + bal + ", overdraftAmt=" + overdraftAmt + ", accId=" + accId + ", accName="
				+ accName + "]";
	}
	
	
}