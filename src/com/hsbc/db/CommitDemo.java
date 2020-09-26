package com.hsbc.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Transaction Management
 * @author suryavanshi
 *
 */

public class CommitDemo {

	static Connection conn = DBConnection.getConnection();

	public static void main(String[] args) {

		try {
			Statement stmt = conn.createStatement();
			conn.setAutoCommit(false);
			stmt.executeQuery("insert into emp values(103,'ABC',2000");
			stmt.executeQuery("insert into emp values(104,'AAA',2112");
			conn.commit();														//Commit
			System.out.println("Done");

		} catch (SQLException e) {
			try {
				conn.rollback();												//Rollback if exception
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

}
