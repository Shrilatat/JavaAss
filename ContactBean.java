package com.hsbc.bean;

import java.util.List;

public class ContactBean {
	String fname;
	String lname;
	String mail;
	double phone;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "ContactBean [fname=" + fname + ", lname=" + lname + ", mail=" + mail + ", phone=" + phone + "]";
	}

}
