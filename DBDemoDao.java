package com.trg;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBDemoDao {

	Connection conn=null;
	
	public DBDemoDao() {
		conn= DBConnection.getConnection();
	}
	
	
	 boolean Validation(String username,String password) throws SQLException  {
		 try {
	 
		String sql="Select * from use where userName= '"+username+"'";
		Statement stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery(sql);
		rs.next();
				if(rs.getString(2).equals(password)) {
					 return true;
				}
			
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return false;

	}  }



