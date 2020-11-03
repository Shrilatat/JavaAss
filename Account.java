package com.Account;

import java.sql.Date;
import java.util.Iterator;

public class Account {
	private int id;
	
	private String name, type;
	private double balance;
	Date creationDate;
	protected Account(int id, String name, String type, double balance, Date creationDate) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.balance = balance;
		this.creationDate = creationDate;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	public void showAccountDetails() {
		System.out.println("Account [id=" + id + ", name=" + name + ", type=" + type + ", balance=" + balance
				+ ", creationDate=" + creationDate + "]");
	}
	
	
}
