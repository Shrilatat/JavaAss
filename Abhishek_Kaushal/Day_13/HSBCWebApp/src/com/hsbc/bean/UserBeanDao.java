package com.hsbc.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.db.DBConnection;

public class UserBeanDao {
	
	List<UserBean> list = new ArrayList<>();
	
	DBConnection connection = new DBConnection();
	Connection conn = connection.getConnection();
	
	
	
	public UserBeanDao() {
		super();
	}

	public List<UserBean> getList() {
		return list;
	}

	public void setList(List<UserBean> list) {
		this.list = list;
	}
	
;	public void addUser(UserBean user)
	{
		try {
			System.out.println(conn);
			PreparedStatement pstmt = conn.prepareStatement("Insert into UserTable values(?, ?, ?, ?, ?, ?, ?)");
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getEmail());
			pstmt.setString(4, user.getGender());
			pstmt.setInt(5, user.getAge());
			pstmt.setString(6, user.getAddress());
			pstmt.setInt(7, user.getPhone());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<UserBean> showUserTable()
	{
		list.clear();
		try {
			PreparedStatement pstmt = conn.prepareStatement("select * from UserTable");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				list.add(new UserBean(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getInt(7)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	

}
