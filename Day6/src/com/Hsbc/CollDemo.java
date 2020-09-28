package com.Hsbc;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
public class CollDemo {
//		public static void main(String[] args) {
			
		
//	Vector v=new Vector(5);
//	System.out.println(v.size());
//	System.out.println(v.capacity());
//	
//	v.add("aaa");
//	v.add(new Date());
//	v.add(100);
//	
//	System.out.println(v.size());
//	System.out.println(v.capacity());
//	
//	v.add("aaa");
//	v.add(new Date());
//	v.add(100);
//	
//	System.out.println(v.size());//size beyound 5
//	System.out.println(v.capacity());//size doubles
//	
//	v.trimToSize();
//	System.out.println(v.size());//size beyound 5
//	System.out.println(v.capacity());//size doubles
//	
			
//			Vector v=new Vector(5);
//
//			v.add("aaa");
//			v.add(new Date());
//			v.add(100);
//			
//			for (Object object : v) {
//				System.out.println(object);
//			}
//			
//			String str=(String)v.get(0);
//			Date d1=(Date)v.get(1);
	public static void main(String[] args) {
		
		
//			List<Integer> list=new LinkedList<>();//empty diamond operator
//			list.add(100);
//			list.add(2000);
		//	list.add(3000);
		//	list.add(100);
				
//			for (Integer integer : list) {
//				System.out.println(integer);
//			}
//			
//			List<String> modules=new LinkedList();
//			modules.add("Java");
//			modules.add("Servlet");
//			modules.add("JSP");
//				
//			for (String string : modules) {
//				System.out.println(string);
//			}
//	
			//pre jdk5 //
//			Iterator<Integer> it=list.iterator();
//			while(it.hasNext())
//			{
//				int i=it.next();
//				System.out.println(i*i);
//			}
			
		List<Person> persons=new ArrayList<>();
		persons.add(new Person(1,"aaa",30));
		persons.add(new Person(2,"bbb",32));
		persons.add(new Person(3,"ccc",36));
		persons.add(new Person(4,"ddd",31));
		Iterator<Person> it=persons.iterator();
		while(it.hasNext())
		{
			Person p=it.next();
		//	System.out.println(p.getAge()+10);
			if(p.getAge()>35)
				it.remove();
		}
			System.out.println(persons);
			
}
}