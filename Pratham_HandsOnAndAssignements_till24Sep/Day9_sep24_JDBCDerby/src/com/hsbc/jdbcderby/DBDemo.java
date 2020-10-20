package com.hsbc.jdbcderby;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemo {
	public static void main(String[] args) {
		
		String sql = "insert into emp values(104, 'ddd',10000)";
		String deleteRecord = "delete from emp where empid>102";
		String selectQuery = "select * from emp";
		try {
			//1 load driver
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
			//Class.forName(org.apache.derby.jdbc.ClientDriver());
			//2 create connection
			Connection conn =DriverManager.getConnection("jdbc:derby://localhost:1527//TestDB1");
			//getConnection has overloaded method which accepts username and password also
			//getConnection(url,usrn,pass)
			System.out.println(conn);
			//3 create SQL statement
			Statement stmt = conn.createStatement();
			//4 Execute the statement
			//executeUpdate() - DML,DDl but never do DDL in java this is done by DB administrator in ij console
			//executeUpdate() returns the number of rows affected by the query
			int noOfRows = stmt.executeUpdate(deleteRecord);
			
			//for query statements like select we always use executeQuery()
			//executequery() returns the DB status and can be stored in an object of ResultSet
			ResultSet rs = stmt.executeQuery(selectQuery);
			//to display the records we use methods of rs
			while(rs.next()){
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
				System.out.println("--------------");
			}//this puts the pointer to first row of table
			//rs.getXXX() has various methods to extract that data from the current row
			//5 iterate in ij console in cmd
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
