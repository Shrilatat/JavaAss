package com.abc.collections;

public class Customer {
	private int id;
	private String name,phNo,email,address;
	private dateclass dob = new dateclass();
	
	
	public Customer(int id, String name, String phNo, String email, String address, dateclass dob) {
		super();
		this.id = id;
		this.name = name;
		this.phNo = phNo;
		this.email = email;
		this.address = address;
		this.dob = dob;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public dateclass getDob() {
		return dob;
	}
	public void setDob(dateclass dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phNo=" + phNo + ", email=" + email + ", address=" + address
				+ ", dob=" + dob + "]";
	}
	
	
}
