package com.hsbc.jdbc.ex2;

public class Account {
	private int accId;
	private String accName;
	private String accType;
	private int accBal;
	public Account() {	}
	public Account(int accId, String accName, String accType, int accBal) {
		super();
		this.accId = accId;
		this.accName = accName;
		this.accType = accType;
		this.accBal = accBal;
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
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public int getAccBal() {
		return accBal;
	}
	public void setAccBal(int accBal) {
		this.accBal = accBal;
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accName=" + accName + ", accType=" + accType + ", accBal=" + accBal + "]";
	}
	
	
}
