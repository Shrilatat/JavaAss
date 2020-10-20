package com.hsbc.jdbc.Bank;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BankCustomerOps {
	static Connection conn = null;

	public BankCustomerOps() {
		conn = DBConnection.getConnection();
	}

	public void balanceEnquiry(int accountID) throws SQLException {
		Statement stmt = conn.createStatement();
		String balenq = "select acctbal,acctname from bankaccount where acctid=" + accountID;
		ResultSet rs = stmt.executeQuery(balenq);
		System.out.println(rs.getString(2) + " your balance is : Rs " + rs.getString(1) + "/- only");
	}

	public void withdrawMoney(int accID, int amount) throws SQLException {
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		String withdraw = "select acctbal from bankaccount where acctid=" + accID;
		ResultSet rs = stmt.executeQuery(withdraw);
		System.out.println("Your Account balance is Rs " + rs.getString(1));
		try {

			int balance = rs.getInt(1);
			if (balance > amount) {
				conn.setAutoCommit(false);
				balance = rs.getInt(1) - amount;
				String updateAccount = "update bankaccount set acctbal=" + balance + "where acctid=" + accID;
				int count = stmt.executeUpdate(updateAccount);
				System.out.println("Dispensing Cash");
				conn.commit();
			}
		} catch (Exception e) {
			conn.rollback();
		}

	}
	
	public void depositMoney(int accID, int amount) throws SQLException {
		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		String balenq= "select acctbal from bankaccount where acctid=" + accID;
		ResultSet rs = stmt.executeQuery(balenq);
		System.out.println("Your Account balance is Rs " + rs.getString(1));
		int balance = rs.getInt(1);
		balance = rs.getInt(1) - amount;
		String updateAccount = "update bankaccount set acctbal=" + balance + "where acctid=" + accID;
		int count = stmt.executeUpdate(updateAccount);
		System.out.println("Dispensing Cash");
		
	}
}
