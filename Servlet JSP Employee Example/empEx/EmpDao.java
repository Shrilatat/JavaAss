package com.hsbc.servletdemo.empEx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.servletdemo.book.Book;

//jsp pages used are-
//index.jsp, LoginEx.jsp, welcomeEmp.jsp, empDet.jsp,viewEmp.jsp

public class EmpDao {
	Connection conn=null;
	List<Employee> elist=new ArrayList<>();

	public EmpDao() {
		conn=DBConnection.getConnection();
	}
	
	public List<Employee> getAllEmp() throws SQLException{
		List<Employee> elist=new ArrayList<>();
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("select * from emp");
		
		while(rs.next())
		{
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			elist.add(new Employee(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));	
		}
		return elist;
	}
	
	public boolean deletEmp(String id) throws SQLException{
		PreparedStatement pst=conn.prepareStatement("delete from emp where eid=?");
		pst.setString(1, id);
		
		int i=pst.executeUpdate();
		if(i>0) {
			System.out.println("Rows affected"+i);
			return true;
		}
		else 
		{
			System.out.println("Falsee");
			return false;
		}

	}
	
	boolean addEmp(String eid1,String ename1,String sal1,String dept1) throws SQLException {
		String sql="insert into emp values(?,?,?,?)";
		PreparedStatement pst=conn.prepareStatement(sql);
		
		pst.setString(1, eid1);
		pst.setString(2, ename1);
		pst.setString(3, sal1);
		pst.setString(4, dept1);
		
		int i=pst.executeUpdate();
		if(i>0) {
			System.out.println("Rows affected"+i);
			return true;
		}
		else 
		{
			System.out.println("Falsee");
			return false;
		}
		
	
			
		
	}
	

}
