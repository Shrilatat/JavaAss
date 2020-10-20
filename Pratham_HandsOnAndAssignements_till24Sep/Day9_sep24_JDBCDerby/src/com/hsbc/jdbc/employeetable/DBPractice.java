package com.hsbc.jdbc.employeetable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBPractice {

	Connection conn = null;

	public DBPractice() {
		conn = DBConnection.getConnection();
	}

	public void add(Employee emp) {

		String sql = "insert into emp values(?,?,?)";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmpID());
			pstmt.setString(2, emp.getName());
			pstmt.setInt(3, emp.getSalary());
			int count = pstmt.executeUpdate();
			//select query and then result set
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		

	}

}