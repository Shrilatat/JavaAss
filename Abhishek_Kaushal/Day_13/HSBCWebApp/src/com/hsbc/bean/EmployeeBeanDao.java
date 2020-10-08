package com.hsbc.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.db.DBConnection;

public class EmployeeBeanDao {
	List<EmployeeBean> list = new ArrayList<>();
	DBConnection connection = new DBConnection();
	Connection conn = connection.getConnection();
	
	public void addEmployee(EmployeeBean employee)
	{
		try {
			PreparedStatement pstmt = conn.prepareStatement("Insert into Employee values(? , ? , ? , ?)");
			pstmt.setString(1, employee.getId());
			pstmt.setString(2, employee.getName());
			pstmt.setInt(3, employee.getSalary());
			pstmt.setString(4, employee.getDepartment());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteEmployee(String employeeId)
	{
		try {
			System.out.println(employeeId);
			PreparedStatement pstmt = conn.prepareStatement("Delete from Employee where employee_Id = ?");
			pstmt.setString(1, employeeId);
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<EmployeeBean> showAllEmployees()
	{
		try {
			PreparedStatement pstmt = conn.prepareStatement("select * from Employee");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				list.add(new EmployeeBean(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	public List<EmployeeBean> getList() {
		return list;
	}

	public void setList(List<EmployeeBean> list) {
		this.list = list;
	}

}
