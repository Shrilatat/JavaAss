package com.hsbc.assignmentJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Trannsactions {
	public static void main(String[] args) {

		Connect c = new Connect();
		Connection con = c.connect();
		BankingOperations b = new BankingOperations();
		System.out.println("Enter the operation to be performed : \n1.Balance Enquiry \n2.Withdraw\n3.Deposit");
		int choice;
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			b.balanceEnquiry(con);
		case 2:
			b.withdraw(con);
		case 3:
			b.deposit(con);
		}
	}
}
