package com.hsbc.jdbc.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpDao {
	Connection conn=null;
	public EmpDao() {
		conn=DBConnection.getConnection();
	}
	
	public void addEmp(Employee e) throws SQLException {

		
	}
public static void main(String[] args) {
		
//		int eid=111;
//		String sql="";
//		String sql1="delete from emp where empid = 101";
//		try {
//			DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
//			Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/TestDB1");
//			
//			Statement stmt=conn.createStatement();
//			
//			ResultSet rs=stmt.executeQuery("select * from emp where empid="+eid);
//			rs.next();
//			Employee e=new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3));
//			System.out.println(e);
//			while(rs.next())
//			{
//				System.out.println(rs.getInt(1));
//				System.out.println(rs.getString(2));
//				System.out.println(rs.getInt(3));
//				System.out.println("----------------");
//			}
//			EmpDao dao=new EmpDao();
//			dao.addEmp(new Employee(10, "abcd", 199));
//
//		}catch (SQLException e) {
//			e.printStackTrace();
//		}
}
}
