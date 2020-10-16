package com.hsbc.Tasks;

//Author:Amisha
//Date:23/09/2020
//Purpose:Performing manipulations on A given Tree set

import java.util.*;

public class TaskSet {

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<>();

		set.add(28);
		set.add(70);
		set.add(18);
		set.add(17);
		set.add(9);
		set.add(82);
		set.add(7);
		set.add(38);
		set.add(54);
		set.add(91);

		System.out.println("1) Displaying all elemnts =>");
		System.out.println(set);
		
		System.out.println("2) Displaying all elemnts in reverse order =>");
		System.out.println(set.descendingSet());

		System.out.println("3) Displaying element greater than 38 =>");
		System.out.println(set.ceiling(set.higher(38)));

		System.out.println("4) Displaying element greater than or equal to 38 =>");
		System.out.println(set.ceiling(38));

		System.out.println("5) Retreiving and removing first and last elements =>");
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());

		System.out.println("6) Displaying subset =>");
		System.out.println(set.subSet(17, 54));

		System.out.println("7) Displaying first element =>");
		System.out.println(set.first());

		System.out.println("8) Displaying subset of elements less than 54 =>");
		System.out.println(set.headSet(54));
	}

}
