package com.hsbc.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemo {

	public static void main(String args[]) {
		String sql = "insert into emp values(104,'Ujjwal',100000)";

		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());

			Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/TestDB3");
			System.out.println(conn);

			Statement stmt = conn.createStatement();
			//stmt.execute(sql);

			ResultSet rs = stmt.executeQuery("select * from emp");

			while (rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
				System.out.println("-----------");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
