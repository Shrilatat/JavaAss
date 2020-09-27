package com.hsbc.Account;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * 
 * @author ADITI GUPTA
 * 
 * DAO CLASS WHICH ACCESS THE DATABASE AND PERFORMS REQUIRED MODIFICATIONS IN IT!
 */

public class AccountDao {
	Connection conn = DBConnection.getConnection();

	void showBalance(int accID) {
		try {
			Statement stmt = conn.createStatement();
			String sql = "select * from account where AccID=" + accID;
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String atype = rs.getString(3);
			int abal = rs.getInt(4);
			System.out.print("ACCOUNT ID: " + id);
			System.out.print(" NAME: " + name);
			System.out.print(" ACCOUNT TYPE: " + atype);
			System.out.print(" ACCOUNT BALANCE: " + abal);
			System.out.println("\n");
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	void withdraw(int accID, int withdrawAmt) throws AccountBalanceLowException {
		try {
			Statement stmt = conn.createStatement();
			String sql = "select accBal from account where AccID=" + accID;
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			int amt = rs.getInt(1);
			if (withdrawAmt > amt)
				throw new AccountBalanceLowException("Your account balance is low!");
			else {
				int newAmt = amt - withdrawAmt;
				String sql2 = "update account set accBal=" + newAmt + "where accID=" + accID;
				int rs2 = stmt.executeUpdate(sql2);
				System.out.println("YOU HAVE DONE A WITHDRAWL!");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	void deposit(int accID, int withdrawAmt) {
		try {
			Statement stmt = conn.createStatement();
			String sql = "select accBal from account where AccID=" + accID;
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			int amt = rs.getInt(1);
			int newAmt = amt + withdrawAmt;
			String sql2 = "update account set accBal=" + newAmt + "where accID=" + accID;
			int rs2 = stmt.executeUpdate(sql2);
			System.out.println("YOUR ACCOUNT HAS BEEN CREDITED!");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
