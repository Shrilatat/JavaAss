package com.hsbc;
import java.util.Date;
import java.util.Vector;
public class CollDemo {
public static void main(String[] args) {
	Vector v=new Vector(5);
	/*
	 * System.out.println(v.size()); System.out.println(v.capacity());
	 */
	v.add("aaa");//String in java is a vector
	v.add(new Date());v.add(100);
	//v.add(new Integer(100));//wrapper class
	/*
	 * System.out.println(v.size()); System.out.println(v.capacity());
	 */
	
	v.add("aaa");//String in java is a vector
	v.add(new Date());v.add(100);
	/*
	 * System.out.println(v.size());
	 * 
	 * System.out.println(v.capacity());
	 * 
	 * v.trimToSize();
	 */
	for(int i=0;i<v.size();i++)
	{
		System.out.println(v.get(i));
	}
	for(Object o:v)
		System.out.println(o);
	
	String str=(String)v.get(0);//typecast to retrive the string
	Date d1=(Date)v.get(1);
	System.out.println(str+" "+d1);
}
}
