package com.hsbc.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Emp{
	int empId;
	String name;
	public Emp(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + "]";
	}


}

public class MapDemo {

	public static void main(String[] args) {

//		Map<Integer, String> map = new HashMap<>();
//
//		map.put(1, "Jan");
//		map.put(2, "Feb");
//		map.put(3, "Mar");
//		map.put(4, "Apr");
//
//		System.out.println(map.get(4));
//
//		Set<Integer> keys = map.keySet();
//		for (Integer key : keys) {
//			System.out.println(key + " : " + map.get(key));
//		}
		
		Map<String, Emp> map = new HashMap<>();
		
		map.put("Rohan S", new Emp(101,"Rohan Suryavanshi"));
		map.put("A A", new Emp(102,"A A"));
		map.put("B B", new Emp(103,"B B"));
		
		System.out.println(map.get("Rohan S"));
	}

}
