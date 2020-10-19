package com.webdemo.dao;
import com.webdemo.models.*;

public interface IUser {
	
	boolean registerUser(User user);
	boolean validateUser(String username,String password);
}
