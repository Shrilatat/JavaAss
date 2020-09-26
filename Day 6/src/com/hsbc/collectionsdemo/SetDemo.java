package com.hsbc.collectionsdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		
		System.out.println(set);
		
		HashSet<String> set1 = new LinkedHashSet<String>();
		set1.add("aaa");
		set1.add("bbb");
		set1.add("ccc");
		set1.add("ddd");
		
		System.out.println(set1);
	
	}
	

}
