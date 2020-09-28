package com.hsbc.jdbc.ex2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.hsbc.jdbc.ex1.DBConnection;

public class AccDao implements AccDaoIntf{
	static Connection conn=DBConnection.getConnection();

	@Override
	public void checkBal(int accid) {
		try {
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select accbal from account where accid="+accid);
			rs.next();
			System.out.println(" Balance: "+rs.getInt(1));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void withdraw(int accid, int amnt) {
		// TODO Auto-generated method stub
		int val;
		try {
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select accbal from account where accid="+accid);
			rs.next();
			if(rs.getInt(1)>amnt)
				{
				val=rs.getInt(1)-amnt;
				System.out.println("Remaining Balance: "+val);
				stmt.executeUpdate("update account set accbal="+val+" where accid="+accid);
				}
			else System.out.println("Not enough funds!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deposit(int accid, int amnt) {
		int val;
		try {
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select accbal from account where accid="+accid);
			rs.next();
			val=rs.getInt(1)+amnt;
			System.out.println("Updated Balance: "+val);
			stmt.executeUpdate("update account set accbal="+val+" where accid="+accid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void showAccount(int accid) {
		// TODO Auto-generated method stub
		try {
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from account where accid="+accid);
			rs.next();
			System.out.println("Account ID: "+rs.getInt(1)+" Accname: "+rs.getString(2)+" acctype: "
			+rs.getString(3)+" Balance: "+rs.getInt(4));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
