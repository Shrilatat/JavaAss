package com.hsbc.AssignCollect;

import java.util.Date;

public class Customer {
	
	private int custId ;
	private String name ;
	private String address;
	private int contNo;
	private Date dob ;
	
	public Customer(int custId, String name, String address, int contNo, Date dob) {
		this.custId = custId;
		this.name = name;
		this.address = address;
		this.contNo = contNo;
		this.dob = dob;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getContNo() {
		return contNo;
	}
	public void setContNo(int contNo) {
		this.contNo = contNo;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", address=" + address + ", contNo=" + contNo
				+ ", dob=" + dob + "]";
	}
	
	
	

}
