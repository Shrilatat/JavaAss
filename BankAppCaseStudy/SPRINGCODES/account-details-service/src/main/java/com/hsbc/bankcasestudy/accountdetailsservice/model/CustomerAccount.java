package com.hsbc.bankcasestudy.accountdetailsservice.model;

import org.springframework.stereotype.Component;

@Component
public class CustomerAccount {
	private int accountId,customerId;
	private float balance;
	
	public CustomerAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerAccount(int accountId, int customerId, float balance) {
		super();
		this.accountId = accountId;
		this.customerId = customerId;
		this.balance = balance;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "CustomerAccount [accountId=" + accountId + ", customerId=" + customerId + ", balance=" + balance + "]";
	}
	
	
}
