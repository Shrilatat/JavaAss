package com.hsbc.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
	public static void main(String[] args) {
		int empId = 100;
		String empName = "zzz";
		
		String sql = "Insert into emp values(" +empId+","+empName+")";

		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());

			Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/TestDB3");

			System.out.println(conn);

			Statement stmt = conn.createStatement();

//			stmt.executeUpdate(sql);
			int i = stmt.executeUpdate(sql);

			ResultSet rs = stmt.executeQuery("select * from emp");

			while (rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
				System.out.println("-----------------------------------");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
