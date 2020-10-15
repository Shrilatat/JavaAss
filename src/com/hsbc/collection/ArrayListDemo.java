package com.hsbc.collection;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		String str[] = {"aaa", "bbb", "ccc"};
		List<String> l1 = Arrays.asList(str);
		
		List<String> l2 = Arrays.asList("aaa","bbb","ccc");
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DATE));
	}
}
