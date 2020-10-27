package com.hsbc.account;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDAO implements AccountIntf {
	static Connection conn = DBConnection.getConnection();

	@Override
	public void bal_enquiry(int acctid) {
		Statement stmt=null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			ResultSet rs = stmt.executeQuery("select * from account");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void withdraw(int acctid, int amt) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deposit(int acctid, int amt) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub

	}

}
