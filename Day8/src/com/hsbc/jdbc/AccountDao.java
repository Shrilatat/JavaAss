package com.hsbc.jdbc;

import java.io.*;
import java.sql.*;

import com.hsbc.DB.DBConnection;

public class AccountDao {
	static Connection conn=null;
	
	public AccountDao() {
		conn= Conn.getConnection();
	}
	
	public static void main(String[] args) {

		System.out.println("Choose from follwing:");
		System.out.println("1. Balanace Enquiry");
		System.out.println("2. Withdraw");
		System.out.println("3. Deposite");
		System.out.println("4. Exit");
		
		
		//int i;
		BufferedReader i = new BufferedReader(new InputStreamReader(System.in));
		int choice = i.read();
		switch(choice)
		{
		case 1: {
			System.out.println("Enter acc id:");
			BufferedReader accid = new BufferedReader(new InputStreamReader(System.in));
			int id = accid.read();
			String s = ("select * from Account where accId = ?");
			PreparedStatement pstmt = conn.prepareStatement(s);
			pstmt.setInt(1, id);
			System.out.println(pstmt.equals(s));
			break;
		}
		case 2:
		{
			BufferedReader accid = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader amt = new BufferedReader(new InputStreamReader(System.in));
			int id = accid.read();
			int a = amt.read();
			ResultSet rs  =  
		}
			
		}
	} 
	
}
