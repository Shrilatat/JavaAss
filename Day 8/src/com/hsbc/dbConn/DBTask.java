package com.hsbc.dbConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTask {

	public static void main(String[] args) throws SQLException {

		DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());

		Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/TestDB3;");
		System.out.println("Connection established =>" + conn);

		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

		Statement stmt1 = conn.createStatement();

		Statement stmt2 = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);

		ResultSet rs = stmt.executeQuery("select * from emp");

		while (rs.next()) {
			System.out.println(rs.getString(1) + "	:	" + rs.getString(2) + "	:	" + rs.getString(3));
		}

		rs.first();
		System.out.println();
		System.out.println(rs.getString(1) + "	:	" + rs.getString(2) + "	:	" + rs.getString(3));

	}
}
