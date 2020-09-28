package com.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * Operations Performed Add, Iterate, Sort[Asc,Desc],Comparator and Comparable,remove
 */
public class ListDemo {
	
	
	private ArrayList<Series> mylistofseries = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	
	// Add Data
	public void enterData(int num) {

		while(num!=0) {
			System.out.println("Enter Series name,fav character,rating :");
			
			mylistofseries.add(new Series(sc.nextLine(),sc.nextLine()));
			num--;
		}
		
		
	}
	
	
	// Display Iterator
	
	public void displayData() {
		Iterator<Series> itr = mylistofseries.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	
	// Get an item From List
	public Series getSeries(int index) {
		return mylistofseries.get(0);
	}
	
	//Remove the element
	public void removeSeries(Series s) {
		mylistofseries.remove(s);
	}
	// Sort using Comparator
	public void sortByComparable() {
		System.out.println("\nAscending Sort by Character");
		Collections.sort((ArrayList)mylistofseries);
	}
	
	
	//Sort using Comparator
	public void sortByComparator() {
		Collections.sort(mylistofseries,Series.compareByName);
		System.out.println("\nDescending Sort By Name");
		displayData();
		System.out.println("\nDescending Sort By Character");
		Collections.sort(mylistofseries,Series.compareByChar);
		displayData();
	}
	
}
