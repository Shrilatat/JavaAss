package com.hsbc.javaFeatures;

import java.util.*;
import java.util.function.Consumer;

public class java7Demo {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee");

		List<Emp> emps = Arrays.asList(new Emp(101, "AAAA"));

//		for (String s : list1)
//			System.out.println(s);

		list1.forEach(new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println(s);
			}

		});
		
		emps.forEach(new Consumer<Emp>() {

			@Override
			public void accept(Emp emp) {
				System.out.println(emp);
			}

		});

	}

}
/*
 * class MyConsumer implements Consumer<String> {
 * 
 * @Override public void accept(String s) System.out.println(s); }
 */