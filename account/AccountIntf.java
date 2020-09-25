package com.hsbc.account;

public interface AccountIntf {
	void bal_enquiry(int acctid);
	void withdraw(int acctid, int amt);
	void deposit(int acctid, int amt);
	void exit();
	
}
