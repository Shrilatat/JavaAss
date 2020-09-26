package com.hsbc.assignment7;

public interface AccontIntf {
	
	void balanceEnquiry(int empid);
	void withdraw(int empid, int amt);
	void deposit(int empid, int amt);
}
