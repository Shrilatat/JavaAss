package com.hsbc.app;

public class Account {

	private int AcctID;
	private String AcctName;
	private String AcctType;
	private int AcctBal;

	public Account() {
	}

	public Account(int acctID, String acctName, String acctType, int acctBal) {
		super();
		AcctID = acctID;
		AcctName = acctName;
		AcctType = acctType;
		AcctBal = acctBal;
	}

	public int getAcctID() {
		return AcctID;
	}

	public void setAcctID(int acctID) {
		AcctID = acctID;
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
		return "Account [AcctID=" + AcctID + ", AcctName=" + AcctName + ", AcctType=" + AcctType + ", AcctBal="
				+ AcctBal + "]";
	}

}
