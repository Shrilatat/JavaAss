package com.hsbc.beans;

import java.sql.*;
import java.util.*;

public class ManagerDao {

	static Connection conn = null;
	
	public ManagerDao() {
		conn = DBConnection.getConnection();
	}
	
	public int addContact(ManagerBean mb) {

		int myFlag = 0;
		try{   
			PreparedStatement ps=conn.prepareStatement("insert into contact values(?,?,?,?)");  
			ps.setString(1,mb.getFirstname());  
			ps.setString(2,mb.getLastname());  
			ps.setString(3,mb.getEmail());  
			ps.setString(4,mb.getTelephone());  
			myFlag = ps.executeUpdate();  
		}catch(Exception e){
			e.printStackTrace();
		}  
		return myFlag;
	}
	
	public int deleteContact(ManagerBean mb) {

		int myFlag = 0;
		try{  
			PreparedStatement ps=conn.prepareStatement("delete from contact where phone=?");  
			ps.setString(1,mb.getTelephone());  
			myFlag = ps.executeUpdate();  
		}catch(Exception e){
			e.printStackTrace();
		}  

		return myFlag;  
	}
	
	public List<ManagerBean> display() {

		List<ManagerBean> lists = new ArrayList<>();  

		try{  
			PreparedStatement ps=conn.prepareStatement("select * from contact");  
			ResultSet rs = ps.executeQuery();  
			while(rs.next()){  
				ManagerBean obj = new ManagerBean();  
				obj.setFirstname(rs.getString(1));
				obj.setLastname(rs.getString(2));
				obj.setEmail(rs.getString(3));
				obj.setTelephone(rs.getString(4));
				lists.add(obj);
			}  
		}catch(Exception e){
			e.printStackTrace();
		}  

		return lists;
	}

}
