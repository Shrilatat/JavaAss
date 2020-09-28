package com.hsbc.set;

import java.util.*;

public class SetDemo1 {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(28);
		set.add(70);
		set.add(18);
		set.add(17);
		set.add(9);
		
		System.out.println(set);
		
		System.out.println(set.descendingSet());

	}

}
