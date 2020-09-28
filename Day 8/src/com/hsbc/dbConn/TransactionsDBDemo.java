package com.hsbc.dbConn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionsDBDemo {

	static Connection conn = DBConnection.getConnection();

	public static void main(String[] args) {
		try {
			Statement stmt = conn.createStatement();
			try {
				conn.setAutoCommit(false);// true by def
				stmt.executeUpdate("insert into emp values(105,'awd',12190)");
				stmt.executeUpdate("insert into emp values(106,'qwe',32321)");
				conn.commit();
			} catch (Exception e) {
				conn.rollback();
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}