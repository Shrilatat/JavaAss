package com.hsbc.jdbcderby;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemo {
	public static void main(String[] args) {
		
		String sql = "insert into emp values(109, 'name',12000)";
		String deleteRecord = "delete from emp where empid>102";
		String selectQuery = "select * from emp";
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
			Connection conn =DriverManager.getConnection("jdbc:derby://localhost:1527//TestDB1");
			System.out.println(conn);
			Statement stmt = conn.createStatement();
			int noOfRows = stmt.executeUpdate(deleteRecord);
			ResultSet rs = stmt.executeQuery(selectQuery);
			while(rs.next()){
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
				System.out.println("--------------");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
