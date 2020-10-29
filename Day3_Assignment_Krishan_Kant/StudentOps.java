package demo;

import java.util.*;
public class StudentOps {
	int roll;
	String name;
	private Map<Integer, String> map=new HashMap<>();
	public StudentOps(int roll, String name) {
		
		this.roll = roll;
		this.name = name;
//		map.put(roll, name);
	}
	
	public void setNames()
	{
		map.put(roll, name);
	}
	public void printNames()
	{
		Set<Integer> keys=map.keySet();
		for(Integer key:keys)
			System.out.println(key + ":" + map.get(key));
	}
	
	public void getName(String name)
	{
		Set<Integer> keys=map.keySet();
		
		for(Integer key:keys)
		{
			String test=map.get(key);
			if(test.equals(name))
				System.out.println(key + ":" + map.get(key));

		}
	}
	 public void printSize()
	 {
		 System.out.println(map.size());
	 }
	 public void remove(int key)
	 {
		 map.remove(key);
	 }
	
}
