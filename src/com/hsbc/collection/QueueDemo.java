package com.hsbc.collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<String>  names = new LinkedList<>();
		
		names.add("Rohan");
		names.add("aaa");
		names.add("bbb");
		
		System.out.println(names);

	}

}
