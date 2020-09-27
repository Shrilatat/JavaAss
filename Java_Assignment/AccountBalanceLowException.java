package com.hsbc.Account;
/**
 * 
 * @author ADITI GUPTA
 * 
 * EXCEPTION CLASS TO THROW EXCEPTION WHEN BALANCE IS TOO LOW FOR WITHDRAWL
 */
public class AccountBalanceLowException extends Exception {

	public AccountBalanceLowException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

}
