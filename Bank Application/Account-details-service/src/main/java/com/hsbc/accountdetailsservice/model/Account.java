package com.hsbc.accountdetailsservice.model;

public class Account {
	int accId;
	int custId;
	int bal;
	public Account(int accId, int custId, int bal) {
		super();
		this.accId = accId;
		this.custId = custId;
		this.bal = bal;
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", custId=" + custId + ", bal=" + bal + "]";
	}
	
	
}