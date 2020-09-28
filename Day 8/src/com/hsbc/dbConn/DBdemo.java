package com.hsbc.dbConn;

import java.sql.*;

public class DBdemo {

	public static void main(String[] args) {

		String sql1 = "insert into emp values(116,'Fareeya',20000)";
		String sql2 = "delete from emp where empid=116";
		String sql3 = "select * from emp";

		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());

			Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/TestDB3;");
			System.out.println("Connection established =>" + conn);

			Statement stmt = conn.createStatement();

//			int count = stmt.executeUpdate(sql2);			//count displays number of affected rows
//			System.out.println(count);

			ResultSet rs = stmt.executeQuery(sql3);

			while (rs.next()) {
				System.out.print(rs.getInt(1) + "	");
				System.out.print(rs.getString(2) + "	");
				System.out.println(rs.getInt(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
