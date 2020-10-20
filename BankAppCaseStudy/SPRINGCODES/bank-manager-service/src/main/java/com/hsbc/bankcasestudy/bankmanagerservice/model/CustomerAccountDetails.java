package com.hsbc.bankcasestudy.bankmanagerservice.model;

public class CustomerAccountDetails {
	private int cutomerId,accountId;
	private String customerName,address;
	private float balance;
	
	public CustomerAccountDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerAccountDetails(int cutomerId, int accountId, String customerName, String address, float balance) {
		super();
		this.cutomerId = cutomerId;
		this.accountId = accountId;
		this.customerName = customerName;
		this.address = address;
		this.balance = balance;
	}

	public int getCutomerId() {
		return cutomerId;
	}

	public void setCutomerId(int cutomerId) {
		this.cutomerId = cutomerId;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "CustomerAccountDetails [cutomerId=" + cutomerId + ", accountId=" + accountId + ", customerName="
				+ customerName + ", address=" + address + ", balance=" + balance + "]";
	}
	
	
}
