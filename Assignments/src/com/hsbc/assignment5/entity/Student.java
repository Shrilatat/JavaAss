package com.hsbc.assignment5.entity;

import java.util.*;

public class Student {
		
	private	HashMap<String,String> stud=new HashMap<>();
		
		public void setNames()
		{
			stud.put("1","Sid");
			stud.put("2","Aditya");
			stud.put("3","pratik");
		}
		
		public void printNames()
		{
			Set set=stud.entrySet();
			Iterator iterator=set.iterator();
			while(iterator.hasNext())
			{
				Map.Entry map=(Map.Entry)iterator.next();
				System.out.print("rollno is:"+map.getKey()+"& name is:");
				System.out.println(map.getValue());	
			}
		}
		
		public void getNames(String key)
		{
//			Set set=stud.entrySet();
//			Iterator iterator=set.iterator();
//			Map.Entry map=(Map.Entry)iterator.next();
			if(stud.containsKey(key))
				System.out.println(stud.get(key));
		}
		
		public void printSize()
		{
			System.out.println(stud.size());
		}
		
		public void remove(String key)
		{
			stud.remove(key);
		}
		
}
