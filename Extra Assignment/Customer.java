package com.demo;

public class Customer {
	private int custID;
	private String custName, contactNo, address;
	private Date dob;
	
	public Customer(int custID, String custName, String contactNo, String address, Date dob) {
		super();
		this.custID = custID;
		this.custName = custName;
		this.contactNo = contactNo;
		this.address = address;
		this.dob = dob;
	}

	public int getCustID() {
		return custID;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String toString() {
		return "Customer [custID=" + custID + ", custName=" + custName + ", contactNo=" + contactNo + ", address="
				+ address + ", dob=" + dob + "]";
	}
	
	
}
