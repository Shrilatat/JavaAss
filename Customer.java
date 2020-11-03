package com.TrackingCustomerDetails;

import java.sql.Date;

public class Customer {
	

	private int custId, custNo;
	private String address, custName;
	private Date dob;
	public Customer(int custId, int custNo, String address, String custName, Date dob) {
		super();
		this.custId = custId;
		this.custNo = custNo;
		this.address = address;
		this.custName = custName;
		this.dob = dob;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getCustNo() {
		return custNo;
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public void displayDetails() {
		System.out.println("Customer [custId=" + custId + ", custNo=" + custNo + ", address=" + address + ", custName=" + custName
				+ ", dob=" + dob + "]");
	}
	
	
}
