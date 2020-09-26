package com.coll;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Emp
{
	int empid;
	String emane;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmane() {
		return emane;
	}
	public void setEmane(String emane) {
		this.emane = emane;
	}
	
	public Emp(int empid, String emane) {
		super();
		this.empid = empid;
		this.emane = emane;
	}
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", emane=" + emane + "]";
	}
}

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer , String> map = new HashMap<>();
		map.put(1, "Jan");
		map.put(2, "Feb");
		map.put(3, "Mar");
		map.put(4, "Apr");
		System.out.println(map.get(1));
		
		Set<Integer> keys = map.keySet();
		for(Integer key : keys)
			System.out.println(key + " , " + map.get(key));
		
		Map<String , Emp> map1 = new HashMap<>();
		map1.put("PG", new Emp(101 , "Pooja Gambhir"));
		map1.put("AS", new Emp(102 , "Abhinav Srivastava"));
		map1.get("AS");
		
		
	}

}
