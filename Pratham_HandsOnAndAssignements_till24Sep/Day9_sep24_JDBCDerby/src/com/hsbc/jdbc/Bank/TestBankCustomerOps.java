package com.hsbc.jdbc.Bank;

import java.util.Scanner;

public class TestBankCustomerOps {
	

	public static void main(String[] args) {
		BankCustomerOps customer = new BankCustomerOps();
		System.out.println("Welcome to Fast banking\n Please choose the number for your desired operation:\n ");
		System.out.println("1.Balance Enquiry\n2.Withdraw\n3.Deposit\n4.Exit");
		int option;
		Scanner s = new Scanner(System.in);
		option=s.nextInt();
		switch(option){
			case 1: 
			case 2:
			case 3:
			case 4:
			default:
		}
	}
}
