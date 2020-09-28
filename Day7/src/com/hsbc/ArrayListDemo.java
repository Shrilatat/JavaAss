package com.hsbc;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		String[] str= {"aaa","bbb"};
		List<String> l2=Arrays.asList(str);
		System.out.println(l2);
		
		List<String> l3=Arrays.asList("aaa","bbb");
		System.out.println(l3);
	}
}
