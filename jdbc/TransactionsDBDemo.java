package com.hsbc.jdbcderby;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.hsbc.jdbc.employeetable.DBConnection;

public class TransactionsDBDemo {
	static Connection conn=DBConnection.getConnection();
	public static void main(String[] args) {
		try {
			Statement stmt = conn.createStatement();
			try {
				conn.setAutoCommit(false);
				stmt.executeUpdate("insert into emp values(105,'awd',12190)");
				stmt.executeUpdate("insert into emp values(106,'qwe',32321)");
				conn.commit();
			}
			catch(Exception e) {
				conn.rollback();
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage()); 
		}
	}
}
