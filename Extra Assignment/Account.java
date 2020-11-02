package com.demo;

public class Account {
	private int id;
	private double balance;
	private String name,type;
	private Date doc;
	
	public Account(int id, double balance, String name, String type, Date doc) {
		this.id = id;
		this.balance = balance;
		this.name = name;
		this.type = type;
		this.doc = doc;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
