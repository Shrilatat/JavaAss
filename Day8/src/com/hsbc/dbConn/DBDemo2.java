package com.hsbc.dbConn;

import java.sql.*;

public class DBDemo2 {
	{
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());

			Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/TestDB3;");
			System.out.println("Connection established =>" + conn);

			Statement stmt = conn.createStatement();

			conn.setAutoCommit(false);
			stmt.executeUpdate("insert into emp values(102,'vaibhav',5000)");
			stmt.executeUpdate("insert into emp values(103,'param',2000)");
			conn.commit();
		} catch (SQLException e) {
			//conn.rollback();
		}

	}
}