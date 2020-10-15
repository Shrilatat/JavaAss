package com.hsbc.assignment7;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		AccountDao accountDao = new AccountDao();
		Scanner in = new Scanner(System.in);
		int choice;
		while(true) {
		System.out.println("-----MENU-----");
		System.out.println("1. Balance Enquiry");
		System.out.println("2. Withdraw");
		System.out.println("3. Deposit");
		System.out.println("4. Exit");
		System.out.println("Enter Choice:");
		choice = in.nextInt();
		
		switch(choice) {
		case 1:
			int accId;
			System.out.println("Enter Account ID:");
			accId = in.nextInt();
			accountDao.balanceEnquiry(accId);
			break;
			
		case 2:
			int amt;
			accId = 0;
			System.out.println("Enter Account ID:");
			accId = in.nextInt();
			System.out.println("Enter amount to deposit:");
			amt = in.nextInt();
			accountDao.withdraw(accId, amt);
			break;
			
		case 3:
			amt = 0;
			accId = 0;
			System.out.println("Enter Account ID:");
			accId = in.nextInt();
			System.out.println("Enter amount to deposit:");
			amt = in.nextInt();
			accountDao.deposit(accId, amt);
			break;
			
		case 4:
			System.out.println("Thank You !!");
			System.exit(0);
			break;
			
		default:
			System.out.println("Wrong Choice !!");
		}
		
		}
	}

}
