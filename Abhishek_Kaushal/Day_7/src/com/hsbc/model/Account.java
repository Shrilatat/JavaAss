package com.hsbc.model;

public class Account {
	
	private int accId;
	private String accName;
	
	public Account() {}
	public Account(int accId, String accName) {
		super();
		this.accId = accId;
		this.accName = accName;
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accName=" + accName + "]";
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	

}
