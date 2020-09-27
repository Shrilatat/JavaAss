package com.hsbc.Account;

import java.util.Scanner;
/**
 * 
 * @author Fareeya Khan
 * 
 * BUSINESS CLASS TO INTERACT WITH DATA SOURCE
 */

public class Account {

	public static void main(String[] args) {
		AccountDao dao = new AccountDao();
		int choice, accID, withdrawAmt, depositAmt;
		do {
			System.out.println("1.BALANCE ENQUIRY 2.WITHDRAW 3.DEPOSIT 4.EXIT");
			System.out.println("Enter your choice");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter your Account ID! ");
				accID = sc.nextInt();
				dao.showBalance(accID);
				break;
			case 2:
				System.out.println("Enter your Account ID! ");
				accID = sc.nextInt();
				System.out.println("Enter the amount to withdraw! ");
				withdrawAmt = sc.nextInt();
				try {
					dao.withdraw(accID, withdrawAmt);
				} catch (AccountBalanceLowException e) {

					e.printStackTrace();
				}
				break;
			case 3:
				System.out.println("Enter your Account ID! ");
				accID = sc.nextInt();
				System.out.println("Enter the amount to deposit! ");
				depositAmt = sc.nextInt();
				dao.deposit(accID, depositAmt);
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Wrong Choice !");
			}
		} while (choice >= 1 && choice <= 4);

	}

}
