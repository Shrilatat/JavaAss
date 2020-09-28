package com.hsbc.accexample;

public class Account {
	private int accid;
	private String accName;
	
	public Account() {	}

	public Account(int accid, String accName) {
		super();
		this.accid = accid;
		this.accName = accName;
	}

	public int getAccid() {
		return accid;
	}

	public void setAccid(int accid) {
		this.accid = accid;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}
}

class SavingAccount extends Account{
	int minBal;
	int bal;
	public SavingAccount(int accid,String accName,int minBal, int bal) {
		super(accid,accName);
		this.minBal = minBal;
		this.bal = bal;
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
	@Override
	public String toString() {
		return "SavingAccount [accid= "+this.getAccid() +", minbalance " + minBal + ", bal=" + bal + "]";
	}
		
}

class CurrentAccount extends Account{
	int bal;
	int overdraftAmt;
	public CurrentAccount(int accid,String accName,int bal, int overdraftAmt) {
		super(accid,accName);
		this.bal = bal;
		this.overdraftAmt = overdraftAmt;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	public int getOverdraftAmt() {
		return overdraftAmt;
	}
	public void setOverdraftAmt(int overdraftAmt) {
		this.overdraftAmt = overdraftAmt;
	}
	@Override
	public String toString() {
		return "CurrentAccount [accid= "+this.getAccid() +", balance "+ bal + ", overdraftAmt=" + overdraftAmt + "]";
	}
	
	
	
}