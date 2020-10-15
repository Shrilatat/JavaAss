package com.hsbc.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.bean.Contact;
import com.hsbc.db.DBConnection;

public class ContactDao {

	static Connection conn = null;

	public ContactDao() {
		conn = DBConnection.getConnection();
	}

	public int addContact(Contact c) {

		int flag = 0;
		try{   
			PreparedStatement ps=conn.prepareStatement("insert into contact values(?,?,?,?)");  
			ps.setString(1,c.getFirst());  
			ps.setString(2,c.getLast());  
			ps.setString(3,c.getEmail());  
			ps.setInt(4,c.getPhone());  
			flag = ps.executeUpdate();  
		}catch(Exception e){
			e.printStackTrace();
		}  
		return flag;
	}

	public int deleteContact(Contact c) {

		int flag = 0;
		try{  
			PreparedStatement ps=conn.prepareStatement("delete from contact where phone=?");  
			ps.setInt(1,c.getPhone());  
			flag = ps.executeUpdate();  
		}catch(Exception e){
			e.printStackTrace();
		}  

		return flag;  
	}

	public List<Contact> display() {

		List<Contact> contacts = new ArrayList<>();  

		try{  
			PreparedStatement ps=conn.prepareStatement("select * from contact");  
			ResultSet rs = ps.executeQuery();  
			while(rs.next()){  
				Contact c = new Contact();  
				c.setFirst(rs.getString(1));
				c.setLast(rs.getString(2));
				c.setEmail(rs.getString(3));
				c.setPhone(rs.getInt(4));
				contacts.add(c);
			}  
		}catch(Exception e){
			e.printStackTrace();
		}  

		return contacts;
	}
}
