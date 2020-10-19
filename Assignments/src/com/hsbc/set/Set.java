package com.hsbc.set;
import java.util.*;


public class Set{

	public static void main(String[] args)
	{
	TreeSet<Integer> set=new TreeSet<>();
	set.add(10);
	set.add(20);
	set.add(30);
	set.add(40);
	set.add(50);
	set.add(60);
	set.add(70);
	set.add(80);
	set.add(90);
	set.add(100);
	System.out.println(set);
	System.out.println(set.descendingSet());
	System.out.println(set.lower(20));
	System.out.println(set.floor(30));
	System.out.println(set.pollFirst());
	System.out.println(set.subSet(20, 80));
	System.out.println(set.first());
	System.out.println(set.last());
	System.out.println(set.pollLast());
	System.out.println(set.headSet(50));
}
}