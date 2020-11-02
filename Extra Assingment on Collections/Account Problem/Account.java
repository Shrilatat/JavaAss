package com.HSBCAccount;


public class Account {
	private int id;
	//private static int refid=0;
	private String name, type;
	private double balance;
	private String dos;
	public Account(int id,String name, String type, double balance, String dos) {
		this.id = id;
		this.name = name;
		this.type=type;
		this.balance = balance;
		this.dos = dos;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", type=" + type + ", balance=" + balance + ", dos=" + dos
				+ "]";
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
