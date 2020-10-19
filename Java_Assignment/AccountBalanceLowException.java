package com.hsbc.Account;
/**
 * 
 * @author Fareeya Khan
 * 
 * EXCEPTION CLASS TO THROW EXCEPTION WHEN BALANCE IS TOO LOW FOR WITHDRAWL
 */
public class AccountBalanceLowException extends Exception {

	public AccountBalanceLowException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

}
