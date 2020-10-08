package com.hsbc.model;

public class CurrAccount extends Account {
	private float overdraftAmt;

	public CurrAccount(int accId, String accName,float overdraftAmt) {
		super(accId, accName);
		this.overdraftAmt = overdraftAmt;
	}

	public float getOverdraftAmt() {
		return overdraftAmt;
	}

	public void setOverdraftAmt(float overdraftAmt) {
		this.overdraftAmt = overdraftAmt;
	}
	

}
