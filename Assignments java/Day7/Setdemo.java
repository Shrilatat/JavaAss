package day7;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setdemo {
public static void main(String[] args) {
	//without generics it can hold any type of data
	TreeSet<Integer> set=new TreeSet<>();
	set.add(202);
	set.add(98);
	set.add(32);
	set.add(66);
	System.out.println(set);
	System.out.println(set.descendingSet());
	
	/*
	 * for(Object o:set) { System.out.println(o); }
	 */
	
	
	//System.out.println(set);
}
}
