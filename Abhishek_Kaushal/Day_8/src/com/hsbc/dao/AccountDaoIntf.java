package com.hsbc.dao;

import com.hsbc.model.InvalidException;

public interface AccountDaoIntf {
	void balanceEnquiry(int acctId) throws InvalidException;
	void withdraw(int acctId, int amount) throws InvalidException;
	void deposit(int acctId, int amount) throws InvalidException;
	void exit();
}
