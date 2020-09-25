package com.hsbc.modelaccount;

public class Account {

	int accId;
	String accName;
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



	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accId, String accName) {
		super();
		this.accId = accId;
		this.accName = accName;
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accName=" + accName + "]";
	}

}