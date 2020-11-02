package com.assign3;

import com.assign1.Date;

public class Customer {
	private int custid;
	private String custname;
	private int contactno;
	private String address;
	private Date dob;
	
	public Customer(int custid, String custname, int contactno, String address, Date dob) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.contactno = contactno;
		this.address = address;
		this.dob = dob;
	}

	public Customer() {}

	public String displayDetails() {
		return "Customer [custid=" + custid + ", custname=" + custname + ", contactno=" + contactno + ", address="
				+ address + ", dob=" + dob + "]";
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public int getContactno() {
		return contactno;
	}

	public void setContactno(int contactno) {
		this.contactno = contactno;
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
	
	
	
}
