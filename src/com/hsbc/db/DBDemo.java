package com.hsbc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemo {
	
	Connection conn = null;
	
	public DBDemo() {
		conn = DBConnection.getConnection();
	}
	
	public static void addEmp(Employee emp1, Statement stmt) {
		try {
			stmt.executeUpdate("insert into emp values(" + emp1.getEmpid() + ",'" + emp1.getName()+ "'," + emp1.getSal() + ")");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println(emp1);
	}
	


	public static void main(String[] args) {

		String sql = "insert into emp values(999,'Rohan',10000)";
		String sql1 = "delete from emp where empid = 101";
		int empId = 101;
		Employee emp = null;
		boolean flag = false;

		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());

			Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/TestDB3");
			System.out.println(conn);

			Statement stmt = conn.createStatement();

			//			int count = stmt.executeUpdate(sql);
			//			if(count > 1)
			//				System.out.println("Insert Successfull");
			//			stmt.executeUpdate(sql1);

			ResultSet rs = stmt.executeQuery("select * from emp where empid=" + empId);
			while(rs.next()) {

				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
				System.out.println("-----------");
				emp = new Employee(rs.getInt(1),rs.getString(2),rs.getInt(3));

			}

			System.out.println(emp);
			
			Employee emp1 = new Employee(102,"XYZ",20000);
			
			addEmp(emp1, stmt);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
