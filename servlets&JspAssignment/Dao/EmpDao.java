package com.hsbc.trg;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 
 * @author Fareeya Khan
 * 
 * 
 * */
public class EmpDao {

	static Connection conn= DBConnection.getConnection();
	
	String[] display(int emp)
	{	System.out.println("Inside dao1");
		try {
			System.out.println("Inside dao2");
			Statement stmt = conn.createStatement();
			String sql = "select * from emp where empid="+emp;
			ResultSet rs = stmt.executeQuery(sql);
			String[] arr = new String[rs.getMetaData().getColumnCount()];
			int columnsNumber =rs.getMetaData().getColumnCount();
			while (rs.next()) {
			for (int i =1; i <= columnsNumber; i++) {
   	         
    	        //System.out.print(",  ");
    	        
    	      	  String columnValue = rs.getString(i);
    	      	//if(columnValue!=null)  
    	      		arr[i-1]=columnValue;
    	      		 System.out.println(columnValue);
    	      	  
    	        }
			
			}
			conn.close();
			System.out.println("Inside dao3");
			return arr;
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return null;
		
		
	}
	

}
