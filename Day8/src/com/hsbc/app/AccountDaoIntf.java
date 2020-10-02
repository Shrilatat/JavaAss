package com.hsbc.app;

import java.sql.SQLException;

public interface AccountDaoIntf {

	public void enquireBalance(int acctId) throws SQLException;
	
	public void withdraw(int accId, int amount) throws SQLException;
	
	public void deposit(int accId, int amount) throws SQLException;
	
	public void exit();
	
}
