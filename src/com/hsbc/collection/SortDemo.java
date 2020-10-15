package com.hsbc.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		List fruits = new ArrayList<>();
		Collections.addAll(fruits, "Apple","Mango","Banana");
		System.out.println(fruits);
		
		Collections.sort(fruits);
		
		System.out.println(fruits);
		
	}

}
