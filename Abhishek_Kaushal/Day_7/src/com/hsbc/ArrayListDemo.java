package com.hsbc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = new ArrayList<>();
		l1.add("aaa");
		l1.add("bbb");
		l1.add("ccc");
		
		String[] str = {"aaa","bbb","ccc"};
		List<String> l2 = Arrays.asList(str);
		
		List<String> l3 = Arrays.asList("aaa","bbb","ccc");

	}

}
