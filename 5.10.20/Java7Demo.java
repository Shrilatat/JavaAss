package com.trg.annon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java7Demo {
	
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("aaa" , "bbb " , "ccc" , "ddd");
		//Pre jdk 1.8 : External iterator
		for(String s : list1)
		{
			System.out.println(s);
		}
		
		//After jdk 1.8:internal iterator
		
		//list1.forEach(new MyConsumer());
		
		//List<Employee> emps = Arrays.asList(new Employee(1 ,"aaa") , new Employee(2 ,"bbb"));
		
		/*list1.forEach(new Consumer<String>()
				{

					@Override
					public void accept(String t) {
						System.out.println(t);
						
					}
				});*/
		
		
		
		
		
		
		//list1.forEach(ele -> System.out.println(ele));
		//list1.forEach(System.out::println);
		
		/*emps.forEach(new Consumer<Employee>() {
			
			@Override
			public void accept(Employee t) {
				System.out.println(t);
			}
		});*/
		
		//list1.forEach(abc -> System.out.println(abc));
		
		List<Integer> l1 = Arrays.asList(10 , 20 , 30 ,40 , 50);
		List<Integer> l2 = new ArrayList<>();
		for(Integer i : l1 )
		{
			l2.add(i*i);
		}
		System.out.println(l1);
		System.out.println(l2);
		
		
		
	}

}

/*
 * class MyConsumer implements Consumer<String> {
 * 
 * @Override public void accept(String s) { System.out.println(s); }
 * 
 * }
 */