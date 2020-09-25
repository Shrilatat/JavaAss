package com.hsbc.modelacc;
/**
* Model class for creating an account of current type
*
/
public class CurrAccount extends Account {

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
	public CurrAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CurrAccount(int accId, String accName,double bal,double overdraftAmt) {
		super(accId, accName);
		this.bal=bal;
		this.overdraftAmt=overdraftAmt;
	}
	@Override
	public String toString() {
		return "CurrAccount [bal=" + bal + ", overdraftAmt=" + overdraftAmt + ", accId=" + accId + ", accName="
				+ accName + "]";
	}
	
	
}
