package com.hsbc.jdbc.ex2;

public interface AccDaoIntf {
	void showAccount(int accid);
	void checkBal(int accid);
	void withdraw(int accid,int amnt);
	void deposit(int accid,int amnt);

}
