package com.hsbc.trg;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.hsbc.bean.EmployeeRegisterationbeans;
/*
 * 
 * @author Fareeya Khan
 * 
 * Dao to save data in the EmployeeRegisteration Table using EmployeeRegisterationbeans file.
 * */

public class AddNewEmployeeDao {
	
	static Connection conn= DBConnection.getConnection();
	
	public  Boolean addEmployee(EmployeeRegisterationbeans eb)
	{
		try {
				String sqlstr="insert into EmployeeRegisteration values(?,?,?,?)";
				PreparedStatement prestr=conn.prepareStatement(sqlstr);
				System.out.print(eb.getId());
				System.out.print(eb.getName());
				System.out.print(eb.getSalary());
				System.out.print(eb.getDepartment());
				prestr.setString(1, eb.getId());
				prestr.setString(1, eb.getName());
				prestr.setDouble(1, eb.getSalary());
				prestr.setString(1, eb.getDepartment());
				prestr.executeUpdate();
				
				return true;
			}
	
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return false;
	}
	
	

}

