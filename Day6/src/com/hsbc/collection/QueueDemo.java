package com.hsbc.collection;
import java.util.*;
public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> names = new LinkedList<>();
		names.add("mauli");
		names.add("hina");
		names.add("rutvi");
		names.add("shinu");
		names.offer("Shiv");
		for(String s : names)
			System.out.println(s);
		System.out.println(names.poll());
	}
	
}
