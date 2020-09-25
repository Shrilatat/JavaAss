package com.hsbc.service;

import java.util.Scanner;

import com.hsbc.dao.AccountDaoImpl;
import com.hsbc.model.InvalidException;

public class TestCustomerOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Select: \n"
				+ "1: For Balance Enquiry \n"
				+ "2: For Withdraw \n"
				+ "3: For Deposit \n"
				+ "4: For Exit.");
		AccountDaoImpl dao = new AccountDaoImpl();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int choice = sc.nextInt();
			
			if(choice == 1)
			{
				System.out.println("Enter Account ID: ");
				int acctId = sc.nextInt();
				try {
					dao.balanceEnquiry(acctId);
				} catch (InvalidException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			}
			else if(choice == 2)
			{
				System.out.println("Enter Account ID: ");
				int acctId = sc.nextInt();
				System.out.println("Enter Amount: ");
				int amount = sc.nextInt();
				try {
					dao.withdraw(acctId, amount);
				} catch (InvalidException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			}
			else if(choice == 3)
			{
				System.out.println("Enter Account ID: ");
				int acctId = sc.nextInt();
				System.out.println("Enter Amount: ");
				int amount = sc.nextInt();
				try {
					dao.deposit(acctId, amount);
				} catch (InvalidException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
			}
			else if(choice == 4)
			{
				dao.exit();
			}
		}

	}

}

