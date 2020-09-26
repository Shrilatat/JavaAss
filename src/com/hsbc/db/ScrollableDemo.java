package com.hsbc.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * ResultSetMetaData
 * Scrollable 
 * @author suryavanshi
 *
 */

public class ScrollableDemo {

	static Connection conn = DBConnection.getConnection();

	public static void main(String[] args) {

		try {
			//Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

			ResultSet rs = stmt.executeQuery("select * from emp");
			
			ResultSetMetaData data = rs.getMetaData();
			System.out.println("Column Count : " + data.getColumnCount());
			System.out.println("Column 1 Name : " + data.getColumnName(1));

			while(rs.next())
				System.out.println(rs.getString(1) + " : " + rs.getString(2) + " : " + rs.getString(3));

			System.out.println("First Record");
			rs.first();
			System.out.println(rs.getString(1) + " : " + rs.getString(2) + " : " + rs.getString(3));
			
			System.out.println("Last Record");
			rs.last();
			System.out.println(rs.getString(1) + " : " + rs.getString(2) + " : " + rs.getString(3));

			System.out.println("Previous Record");
			rs.previous();
			System.out.println(rs.getString(1) + " : " + rs.getString(2) + " : " + rs.getString(3));


		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
