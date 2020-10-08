package com.hsbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hsbc.db.DBConnection;
import com.hsbc.model.InvalidException;

public class AccountDaoImpl implements AccountDaoIntf {
	
	Connection conn = null;
	
	public AccountDaoImpl() {
		// TODO Auto-generated constructor stub
		conn = DBConnection.getConnection();
	}

	@Override
	public void balanceEnquiry(int acctId) throws InvalidException {
		// TODO Auto-generated method stub
		AccountDaoImpl acct = new AccountDaoImpl();
		try {
			PreparedStatement pstmt = conn.prepareStatement("select * from Account where AcctID=?");
			pstmt.setInt(1, acctId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
				System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3)+" : "+rs.getInt(4));
			else
				throw new InvalidException("Invalid Account Id");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void withdraw(int acctId, int amount) throws InvalidException {
		// TODO Auto-generated method stub
		AccountDaoImpl acct = new AccountDaoImpl();
		try {
			PreparedStatement pstmt = conn.prepareStatement("select AcctBal from Account where AcctID=?");
			pstmt.setInt(1, acctId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
				int bal= rs.getInt(1);
				bal = bal-amount;
				if(bal<0)
				{
					throw new InvalidException("Insufficient Balance");
				}
			PreparedStatement pstmt1 = conn.prepareStatement("update Account set AcctBal=? where AcctID=?");
			pstmt1.setInt(1, bal);
			pstmt1.setInt(2, acctId);
			int count = pstmt1.executeUpdate();
			System.out.println("Amount has been withdrawn successfully");
			}
			else
			{
				throw new InvalidException("Invalid Account Id");
			}
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deposit(int acctId, int amount) throws InvalidException {
		// TODO Auto-generated method stub
		AccountDaoImpl acct = new AccountDaoImpl();
		try {
			PreparedStatement pstmt = conn.prepareStatement("select AcctBal from Account where AcctID=?");
			pstmt.setInt(1, acctId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
				int bal= rs.getInt(1);
				bal = bal+amount;
				PreparedStatement pstmt1 = conn.prepareStatement("update Account set AcctBal=? where AcctID=?");
				pstmt1.setInt(1, bal);
				pstmt1.setInt(2, acctId);
				pstmt1.executeUpdate();
				System.out.println("Amount has been deposited successfully");
			}
			else
			{
				throw new InvalidException("Invalid Account Id");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		System.exit(0);
	}

}
