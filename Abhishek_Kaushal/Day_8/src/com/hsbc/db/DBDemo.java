package com.hsbc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemo {
	public static void main(String[] args) {
		
		String sql = "insert into emp values(999, 'Aditi', 9000)";
		String sql1 = "delete from emp where empid > 102";
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
//			Class.forName("org.apache.derby.jdbc.ClientDriver()");
			
			Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/TestDB3");
			System.out.println(conn);
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from emp");
			while(rs.next())
			{
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
				System.out.println();
			}
				
			
			
//			int count = stmt.executeUpdate(sql);
//			System.out.println("Rows Effected: "+count);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
