package com.hsbc.servletdemo.manEx;

public class Manager {
	private String fname;
	private String lname;
	private String mail;
	private String tele;
	
	
	public Manager() {
	}
	public Manager(String fname, String lname, String mail, String tele) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.mail = mail;
		this.tele = tele;
	}
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
	public String getTele() {
		return tele;
	}
	public void setTele(String tele) {
		this.tele = tele;
	}
	
	

}
