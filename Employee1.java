package com.jdbcassign2;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class Employee1 {
public static void main(String[] args) {
	Map<Integer, Empl> empMap= new HashMap<>();
	Connection conn=null;
	Statement stmt=null;
	try {
		DriverManager.registerDriver(new org.apache.derby.jdbc.ClientDriver());
		conn=DriverManager.getConnection("jdbc:derby://localhost:1527/TestDB1");
		stmt = conn.createStatement();
		
		String sql="SELECT * FROM Emp";
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			empMap.put(rs.getInt(1), new Empl(rs.getInt(1), rs.getString(2), 1.1*rs.getInt(3)));
		}		
	} catch (SQLException e) {
		e.printStackTrace();
	}
	finally {
		try {
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	Iterator<Map.Entry<Integer, Empl>> i=empMap.entrySet().iterator();
	
	 while(i.hasNext()) 
     { 
          Map.Entry<Integer, Empl> entry = i.next(); 
          System.out.println(entry.getValue()); 
     } 
	
}
}
