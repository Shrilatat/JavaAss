package com.hsbc.dbConn;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class MetaDataDBDemo {
	static Connection conn = DBConnection.getConnection();

	public static void main(String[] args) {
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");

			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println(rsmd.getColumnCount());
			System.out.println(rsmd.getColumnLabel(1));

			DatabaseMetaData dbmd = conn.getMetaData();
			System.out.println(dbmd.getDatabaseMajorVersion());
			System.out.println(dbmd.getDatabaseProductName());

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}