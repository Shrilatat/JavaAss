package com.hsbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.bean.Employee;
import com.hsbc.db.DBConnection;

public class EmployeeDao {

	static Connection conn = null;

	public EmployeeDao() {
		conn = DBConnection.getConnection();
	}

	public int addEmployee(Employee e) {

		int flag = 0;
		try{   
			PreparedStatement ps=conn.prepareStatement("insert into emps values(?,?,?,?)");  
			ps.setString(1,e.getId());  
			ps.setString(2,e.getName());  
			ps.setInt(3,e.getSal());  
			ps.setString(4,e.getDept());  
			flag = ps.executeUpdate();  
		}catch(Exception ex){
			ex.printStackTrace();
		}  
		return flag;
	}

	public int deleteEmployee(Employee e) {

		int flag = 0;
		try{  
			PreparedStatement ps=conn.prepareStatement("delete from emps where id=?");  
			ps.setString(1,e.getId());  
			flag = ps.executeUpdate();  
		}catch(Exception ex){
			ex.printStackTrace();
		}  

		return flag;  
	}

	public List<Employee> display() {

		List<Employee> employees = new ArrayList<>();  

		try{  
			PreparedStatement ps=conn.prepareStatement("select * from emps");  
			ResultSet rs = ps.executeQuery();  
			while(rs.next()){  
				Employee e = new Employee();  
				e.setId(rs.getString(1));
				e.setName(rs.getString(2));
				e.setSal(rs.getInt(3));
				e.setDept(rs.getString(4));
				employees.add(e);
			}  
		}catch(Exception ex){
			ex.printStackTrace();
		}  

		return employees;
	}
}
