package com.hsbc.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Emp1DAO {
	public static void main(String[] args)
	{
	try {
		Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527//TestDB1");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	void addEmp()
	{
		int eid=108;
		String name="Riya";
		int sal=6000;
		
		String sql="insert into emp values(?,?,?)";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pstmt.setInt(1, eid);
			pstmt.setString(2,name);
			pstmt.setInt(3, sal);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
