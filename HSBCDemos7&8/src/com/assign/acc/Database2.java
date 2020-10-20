package com.assign.acc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database2 {
	
	static String sql2 = "select * from emp where empid = 102";
	static Employee e;
	static Connection conn = null;

public Database2() {
		conn = DBConnection.getConnection();
	}

public static void main(String[] args)  {
		
		try {
			
			Statement stmt = conn.createStatement();
			
			
			ResultSet rs = stmt.executeQuery("sql2 ");
			rs.next();
		  e = new Employee(rs.getInt(1),rs.getString(2), rs.getInt(3) );
			System.out.println(e);
		} 
		
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

void addEmp(Employee emp) throws SQLException
{
	String sql = "insert into emp values(? , ? , ?)";
	
		PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, e.getEmpid());
				pstmt.setString(1, e.getEmpname());
				pstmt.setInt(1, e.getEmpid());
				
		
							

	
}

}
