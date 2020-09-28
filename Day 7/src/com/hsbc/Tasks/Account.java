package com.hsbc.Tasks;

//Author : Amisha
//Date : 24/09/2020
//Purpose : POJO

public class Account {

	private int accId;
	private String acctName;

	public Account() {
	}

	public Account(int accId, String acctName) {
		super();
		this.accId = accId;
		this.acctName = acctName;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	@Override
	public String toString() {
		return "Account [accId=" + accId + ", acctName=" + acctName + "]";
	}
	
}
