package com.hsbc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBExample1 {
	static Connection conn = null;
	
	public DBExample1()
	{
		conn = DBConnection.getConnection();
	}

	public void addEmp(Employee emp) {
		try {
			String sql = "insert into emp values(?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmpId());
			pstmt.setString(2, emp.getEmpName());
			pstmt.setInt(3, emp.getEmpSalary());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int empid = 999;
//		String sql = "insert into emp values(999, 'Aditi', 9000)";
//		String sql1 = "delete from emp where empid > 102";
		
//		Class.forName("org.apache.derby.jdbc.ClientDriver()");
		try {
		
			
			
			DBExample1 ex1 = new DBExample1();
			ex1.addEmp(new Employee(111,"Abhishek", 5000));
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from emp");
			while(rs.next())
				System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getInt(3));
			
			
//			ResultSet rs = stmt.executeQuery("select * from emp where empid=" + empid);
//			rs.next();
//			Employee employee = new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3));
//			System.out.println(employee);

//			int count = stmt.executeUpdate(sql);
//			System.out.println("Rows Effected: "+count);

		} 
	catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
