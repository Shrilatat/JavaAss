package com.hsbc.jdbcderby;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hsbc.jdbc.employeetable.DBConnection;

public class DBPractice {
	static Connection conn=DBConnection.getConnection();
	public static void main(String[] args) {
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
}