package com.hsbc.assignmentJDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BankingOperations {
	Scanner sc = new Scanner(System.in);
	int accNum;

	public void balanceEnquiry(Connection c) {

		System.out.println("Enter your account number : ");
		accNum = sc.nextInt();

		String balanceEnquiry = "select accbal from bank where accnum=" + accNum;

		try {
			Statement stmt = c.createStatement();

			ResultSet rs = stmt.executeQuery(balanceEnquiry);

			rs.next();

			System.out.println(rs.getInt(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void withdraw(Connection c) {
		int withdrawal = 0, temp = 0;
		System.out.println("Enter your account number : ");
		accNum = sc.nextInt();
		System.out.println("Enter the withdrawal amount : ");
		withdrawal = sc.nextInt();
		String getBalance = "select accbal from bank where accnum=" + accNum;

		Statement stmt;
		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(getBalance);
			rs.next();
			temp = rs.getInt(1);
			temp-=withdrawal;
			String update = "update bank set accbal=" + temp + "where accnum=" + accNum;
			stmt.executeUpdate(update);
			
			System.out.println("withdrawal amount = "+withdrawal+".\nAmount after withdrawal is : "+temp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void deposit(Connection c) {
		int deposit = 0, temp = 0;
		System.out.println("Enter your account number : ");
		accNum = sc.nextInt();
		System.out.println("Enter the withdrawal amount : ");
		deposit = sc.nextInt();
		String getBalance = "select accbal from bank where accnum=" + accNum;

		Statement stmt;
		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery(getBalance);
			rs.next();
			temp = rs.getInt(1);
			temp+=deposit;
			String update = "update bank set accbal=" + temp + "where accnum=" + accNum;
			stmt.executeUpdate(update);
			
			System.out.println("withdrawal amount = "+deposit+".\nAmount after withdrawal is : "+temp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
