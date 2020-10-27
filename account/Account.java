package com.hsbc.account;

public class Account {
	private int AccId;
	private String AcctName;
	private String AcctType;
	private int AcctBal;
	
	public Account(int accId, String acctName, String acctType, int acctBal) {
		super();
		AccId = accId;
		AcctName = acctName;
		AcctType = acctType;
		AcctBal = acctBal;
	}

	public int getAccId() {
		return AccId;
	}

	public void setAccId(int accId) {
		AccId = accId;
	}

	public String getAcctName() {
		return AcctName;
	}

	public void setAcctName(String acctName) {
		AcctName = acctName;
	}

	public String getAcctType() {
		return AcctType;
	}

	public void setAcctType(String acctType) {
		AcctType = acctType;
	}

	public int getAcctBal() {
		return AcctBal;
	}

	public void setAcctBal(int acctBal) {
		AcctBal = acctBal;
	}
	
	@Override
	public String toString() {
		return "Account [AccId=" + AccId + ", AcctName=" + AcctName + ", AcctType=" + AcctType + ", AcctBal=" + AcctBal
				+ "]";
	}
}
