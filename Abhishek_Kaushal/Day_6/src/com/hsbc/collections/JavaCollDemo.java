package com.hsbc.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

class Empl{
	private int empId;
	private String empName;
	public Empl(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + "]";
	}
}

public class JavaCollDemo {
	public static void main(String[] args) {
//		List<Person> persons = new ArrayList<>();
//		
//		persons.add(new Person(1,"aaa",20));
//		persons.add(new Person(2,"bbb",30));
//		persons.add(new Person(3,"ccc",40));
//		persons.add(new Person(4,"ddd",50));
//		persons.add(new Person(5,"eee",60));
//		
////		for(Person person: persons)
////		{
////			System.out.println(person);
////		}
//		
//		Iterator<Person> iterator = persons.iterator();
//		while(iterator.hasNext())
//		{
//			Person temp= iterator.next();
//			//System.out.println(temp.getPersonAge()+10);
//			if(temp.personAge==40)
//			{
//				iterator.remove();
//			}
//			
//		}
//		
//		Set<Person> set = new TreeSet<>();
//		set.add(new Person(1,"aaa",20));
//		set.add(new Person(2,"bbb",30));
//		set.add(new Person(3,"fff",40));
//		set.add(new Person(4,"ddd",50));
//		set.add(new Person(5,"eee",60));
//		
//		for(Person p: set)
//		{
//			System.out.println(p);
//		}
//		
//		Queue<Integer> q = new LinkedList<>();
//		q.add(2);
//		q.add(1);
//		q.add(3);
//		q.add(4);
//		q.add(5);
//		
//		for(Integer i:q)
//		{
//			System.out.println(i);
//		}
//		
//		Map<Integer, String> map = new HashMap<>();
//		map.put(1, "Jan");
//		map.put(2, "Feb");
//		map.put(3, "Mar");
//		map.put(4, "Apr");
//		map.put(5, "May");
//		
//		//System.out.println(map.get(3));
//		
//		Set<Integer> keys= map.keySet();
//		for(Integer k:keys)
//		{
//			System.out.println(k + " --> " + map.get(k));
//		}
		
		
		
		Map<String, Empl> map = new HashMap<>();
		map.put("PoojaG", new Empl(101,"Pooja"));
		map.put("AbishekK", new Empl(102,"Abhishek"));
	}

}
