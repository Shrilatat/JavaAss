package com.assign.acc;

public class Account {
	
	int accId;
	String accName;
	public Account(int accId, String accName) {
		this.accId = accId;
		this.accName = accName;
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
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accName=" + accName + "]";
	}
	
	

}
