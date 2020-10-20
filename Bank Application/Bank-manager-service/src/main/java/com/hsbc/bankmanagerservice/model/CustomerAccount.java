package com.hsbc.bankmanagerservice.model;

public class CustomerAccount {
	Customer customer;
	Account account;
	public CustomerAccount(Customer customer, Account account) {
		super();
		this.customer = customer;
		this.account = account;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "CustomerAccount [customer=" + customer + ", account=" + account + "]";
	}
	
	
}