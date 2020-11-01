package com.hsbc.collection_Assignment;

public class Customer {

	private int custId,contNo ;
	private String address,custName;
	private Date dob;
	
	public Customer(int custId, int contNo, String address, String custName, Date dob) {
		super();
		this.custId = custId;
		this.contNo = contNo;
		this.address = address;
		this.custName = custName;
		this.dob = dob;
	}

	public int getCustId() {
		return custId;
	}

	public int getContNo() {
		return contNo;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public void setContNo(int contNo) {
		this.contNo = contNo;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", contNo=" + contNo + ", address=" + address + ", custName=" + custName
				+ ", dob=" + dob + "]";
	}
	
	
	
}
