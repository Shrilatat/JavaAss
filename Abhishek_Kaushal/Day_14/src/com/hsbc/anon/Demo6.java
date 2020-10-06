package com.hsbc.anon;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import javax.lang.model.element.Element;

public class Demo6 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("aa","bb","cc","dd");
		List<Employee> list1 = Arrays.asList(new Employee(1, "bb", 1000) , new Employee(2, "ccc", 2000));
		for(String s : list)
		{
			System.out.println(s);
		}
		
//		list.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//				
//			}
//		});
//		
//		list1.forEach(new Consumer<Employee>() {
//
//			@Override
//			public void accept(Employee t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//		});
		
		list.forEach(ele -> {
			System.out.println(ele);
			System.out.println(ele.length());
		});
		list1.forEach(abc -> System.out.println(abc));
		list1.forEach(System.out::println); //method reference
	}

}

class MyConsumer implements Consumer<String>
{

	@Override
	public void accept(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
		System.out.println(s.length());
	}
}
