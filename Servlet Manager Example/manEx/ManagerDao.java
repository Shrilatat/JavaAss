package com.hsbc.servletdemo.manEx;

import java.util.ArrayList;
import java.util.List;

public class ManagerDao {
	public static List<Manager> mlist=new ArrayList<>();
	
	
	public List<Manager> addManager(Manager m){
		mlist.add(m);
		return mlist;
	}
	
}
