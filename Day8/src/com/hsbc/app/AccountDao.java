package com.hsbc.app;

import java.sql.*;

public class AccountDao implements AccountDaoIntf {
	
	static Connection conn = null;

	public AccountDao() {
		conn = DBConnection.getConnection();
	}

	public void enquireBalance(int acctId) throws SQLException {
		// display info and balance
		Statement stmt = conn.createStatement();
		String balence = "select acctbal,acctname from bankaccount where acctid=" + acctId;
		ResultSet rs = stmt.executeQuery(balence);
		System.out.println( rs.getString(2) + " Remaining amount " + rs.getString(1));

	}

	public void withdraw(int accId, int amount) throws SQLException {
		// amount deducted and message displayed
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		String withdraw = "select acctbal from bankaccount where acctid=" + accId;
		ResultSet rs = stmt.executeQuery(withdraw);
		System.out.println("The money left is => Rs" + rs.getString(1));
		try {

			int balance = rs.getInt(1);
			if (balance > amount) {
				conn.setAutoCommit(false);
				balance = rs.getInt(1) - amount;
				String updateAccount = "update bankaccount set acctbal=" + balance + "where acctid=" + accId;
				int count = stmt.executeUpdate(updateAccount);
				System.out.println("Please collect money.");
				conn.commit();
			}
		} catch (Exception e) {
			conn.rollback();
		}
	}

	public void deposit(int accId, int amount) throws SQLException {
		// amount deducted and message displayed
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		String balance = "select acctbal from bankaccount where acctid=" + accId;
		ResultSet rs = stmt.executeQuery(balance);
		System.out.println("Remaining Amount " + rs.getString(1));
		int bal = rs.getInt(1);
		bal = rs.getInt(1) - amount;
		String updateAccount = "update bankaccount set acctbal=" + bal + "where acctid=" + accId;
		int count = stmt.executeUpdate(updateAccount);
		System.out.println("Money collected.");
	}

	public void exit() {
		// quit application
		System.out.println("Exit");
		System.exit(0);
	}

}
