package com.hsbc.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DemoForEach {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("aaa", "bbb", "ccc");

		// pre jdk1.8:::::::EXTERNAL ITERATOR --
		for (String string : list1) {
			System.out.println(string);
		}


		// JDK1.8:::::::INTERNAL ITERATOR
		/*
		 * list1.forEach(new Consumer<String>() {
		 * 
		 * @Override public void accept(String t) { System.out.println(t); } });
		 * 
		 * List<Emp> emps = Arrays.asList(new Emp(100,"aaa"),new Emp(101,"bbb"));
		 * emps.forEach(new Consumer<Emp>() {
		 * 
		 * @Override public void accept(Emp t) { System.out.println(t);
		 * 
		 * } });
		 */
		System.out.println("\n\nwith lambda");
		list1.forEach(ele -> {
			System.out.println(ele);
			System.out.println(ele.length());
			System.out.println(ele.toLowerCase());
		});
		System.out.println("\n with method reference ::");
		list1.forEach(System.out::println);//with method reference 
	}
}

/*
 * class MyConsumer implements Consumer<String>{
 * 
 * @Override public void accept(String t) { System.out.println(t);
 * System.out.println(t.length()); }
 * 
 * }
 */