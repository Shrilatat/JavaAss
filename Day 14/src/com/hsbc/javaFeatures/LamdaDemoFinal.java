package com.hsbc.javaFeatures;

import java.util.*;
import java.util.function.Consumer;

public class LamdaDemoFinal {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee");

		List<Emp> emps = Arrays.asList(new Emp(101, "AAAA"),new Emp(102, "BBBB"),new Emp(103, "CCCC"));

//		for (String s : list1)
//			System.out.println(s);

//		list1.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String s) {
//				System.out.println(s);
//			}
//
//		});

//		emps.forEach(new Consumer<Emp>() {
//
//			@Override
//			public void accept(Emp emp) {
//				System.out.println(emp);
//			}
//
//		});

		list1.forEach(ele -> {

			System.out.println(ele);
			System.out.println(ele.length());

		});

//		emps.forEach(abc -> System.out.println(abc));

		emps.forEach(System.out::println); // method ref is a shortcut to lamda

	}

}
/*
 * class MyConsumer implements Consumer<String> {
 * 
 * @Override public void accept(String s) System.out.println(s); }
 */