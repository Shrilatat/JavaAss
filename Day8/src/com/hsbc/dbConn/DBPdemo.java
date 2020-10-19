package com.hsbc.dbConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBPdemo {

	Connection conn = null;

	public DBPdemo() {
		conn = DBConnection.getConnection();
	}

	public void add() {

		int eid = 104;
		String name = "vishal";
		int sal = 10000;

		String sql = "insert into emp values(?,?,?)";

		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, eid);
			pstmt.setString(2, name);
			pstmt.setInt(3, sal);

			int count = pstmt.executeUpdate();
			System.out.print(count);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

	}

}
