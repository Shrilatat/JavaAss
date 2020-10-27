package com.hsbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.hsbc.db.DBConnection;

public class LoginDao {
	
	Connection conn = null;
	
	public LoginDao() {
		conn = DBConnection.getConnection();
	}
	
	public Boolean verify(String username, String password) {
		
		try{  
			PreparedStatement ps=conn.prepareStatement("select * from login where username=?");
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();  
			while(rs.next()){  
				if(rs.getString(2).equals(password))
					return true;
			}  
		}catch(Exception ex){
			ex.printStackTrace();
		}  
		
		return false;
	}
}
