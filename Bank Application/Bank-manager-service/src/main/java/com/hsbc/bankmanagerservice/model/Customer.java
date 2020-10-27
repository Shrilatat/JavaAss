package com.hsbc.bankmanagerservice.model;

public class Customer {
	int custId;
	String custName;
	String custAddress;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int custId, String custName, String custAddress) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress + "]";
	}
	
	
}
