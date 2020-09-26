package com.hsbc.assignment7;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.hsbc.db.DBConnection;

public class AccountDao implements AccontIntf {

	int accId;
	String accName;
	String accType;
	int accBal;
	static Connection conn = null;

	public AccountDao() {
		conn = DBConnection.getConnection();
	}

	@Override
	public void balanceEnquiry(int accId) {
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from acc where accid=" + accId);
			rs.next();
			System.out.println("Your balance is " + rs.getString(4));
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void withdraw(int accId,int amt) {
		try {
			PreparedStatement pstmt = conn.prepareStatement("update acc set bal = bal-? where accId = ?");
			pstmt.setInt(1, amt);
			pstmt.setInt(2, accId);
			int count = pstmt.executeUpdate();
			System.out.println(count + " rows updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deposit(int accId, int amt) {
		try {
			PreparedStatement pstmt = conn.prepareStatement("update acc set bal = bal+? where accId = ?");
			pstmt.setInt(1, amt);
			pstmt.setInt(2, accId);
			int count = pstmt.executeUpdate();
			System.out.println(count + " rows updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
