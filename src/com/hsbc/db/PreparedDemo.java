package com.hsbc.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedDemo {
	
	static Connection conn;
	
	public PreparedDemo() {
		conn = DBConnection.getConnection();
	}
	
	public static void add(Employee emp) {
		
		String sql ="insert into emp values(?,?,?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmpid());
			pstmt.setString(2, emp.getName());
			pstmt.setInt(3, emp.getSal());
			
			int count = pstmt.executeUpdate();
			
			String sql1 = "select * from emp where empid = ?";
			PreparedStatement pstmt1 = conn.prepareStatement(sql1);
			pstmt1.setInt(1, 101);
			pstmt1.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

		Employee emp = new Employee(103, "PQR", 50000);
		add(emp);
	}

}
