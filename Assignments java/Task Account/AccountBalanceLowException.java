package com.hsbc.Account;

public class AccountBalanceLowException extends Exception {

	public AccountBalanceLowException(String msg) {
		super(msg);
	}
}