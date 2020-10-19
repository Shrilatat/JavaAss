package com.hsbc.Dao;

import java.sql.*;

import com.hsbc.connect.DataBaseConnect;

public class LoginDao {
	
	Connection conn=DataBaseConnect.getConnection();
	
	public boolean validate(String name,String pass)
		{
		String str = "Select * from login where name = ? and password = ? ";
		System.out.println(name+" "+pass);
		PreparedStatement pst;
			
			try {
				pst=conn.prepareStatement(str);
				pst.setString(1,name);
				pst.setString(2,pass);
				
				ResultSet rs=pst.executeQuery();
				while(rs.next())
				{
				if(name.equals(rs.getString(1))&&pass.equals(rs.getString(2)))
					return true;
				}
				return false;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return false;
		}
}
