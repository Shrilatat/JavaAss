package com.examples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class SetDemo {
	
	private HashSet<Series> myserieslist = new HashSet<>();
	private Scanner sc = new Scanner(System.in);
	
	// Add Data
	public void enterData(int num) {

		while(num!=0) {
			System.out.println("Enter series name,rating :");
			
			myserieslist.add(new Series(sc.nextLine(),sc.nextLine()));
			num--;
		}	
	}
	
	
	// Display Iterator
	public void displayData() {
		Iterator<Series> itr = myserieslist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	


	//Convert to TreeSet
	
	public void convertToTreeSet() {
		
		System.out.println("\nAfter Conversion to TreeSet Elements are Sorted :");
		TreeSet<Series> tset = new TreeSet<Series>(myserieslist);
		Iterator<Series> itr = tset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
