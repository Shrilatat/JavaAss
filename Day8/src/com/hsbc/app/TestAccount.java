package com.hsbc.app;

import java.io.*;
import java.sql.SQLException;

public class TestAccount {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(
				"------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("Welcome!");
		System.out.println("Please enter your choice => ");
		System.out.println("Enter 1 for balance enquiey.");
		System.out.println("Enter 2 to withdrw money.");
		System.out.println("Enter 3 to deposite money.");
		System.out.println("Enter 4 to exit.");
		System.out.println();
		System.out.println(
				"------------------------------------------------------------------------------------------------------------");
		System.out.println();

		int choice = Integer.parseInt(br.readLine());

		AccountDao obj = new AccountDao();

		switch (choice) {
		case 1:
			System.out.println("Please enter your Account ID =>");
			try {
				obj.enquireBalance(112);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 2:
			System.out.println("Please enter your Account ID =>");
			System.out.println("Please enter the amount to be withdrawn =>");
			try {
				obj.withdraw(116, 500);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 3:
			System.out.println("Please enter your Account ID =>");
			System.out.println("Please enter the amount to be withdrawn =>");
			try {
				obj.deposit(111, 1000);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 4:
			obj.exit();
			break;
		default:
		}

	}

}
