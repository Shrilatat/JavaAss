package com.webdemo.dao;

import com.webdemo.models.User;
import java.sql.*;

public class UserImplementation implements IUser {

	public UserImplementation() {
		super();
		connect();
	}

	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public boolean connect() {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();	
			connect = DriverManager.getConnection("jdbc:derby://localhost:1527/FirstDB","admin","password");
			if(connect!=null)
				return true;
			else
				return false;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean registerUser(User user) {
		if(connect==null)
			System.out.println("Connection failed");
		else {
			try {
			preparedStatement = connect.prepareStatement("insert into users values(?,?)");
			preparedStatement.setString(1,user.getUsername());
			preparedStatement.setString(2,user.getPassword());
			int i = preparedStatement.executeUpdate();
			
			if(i==0)
				return false;
			else
				return true;
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		return false;
	}

	@Override
	public boolean validateUser(String username, String password) {
		// TODO Auto-generated method stub
		if(connect==null)
			System.out.println("Connection failed");
		else {
			
		try {
			statement = connect.createStatement();
			resultSet = statement.executeQuery("select * from users");
			int flag=0;
			while(resultSet.next()) {
				if(resultSet.getString("uname").equals(username) && resultSet.getString("upass").equals(password) )
				{
					flag=1;
					return true;
				}
				
			}
			
			if(flag==0)
				return false;
			else
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		return false;
	}

}
