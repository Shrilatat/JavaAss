package com.examples;

public class Main {
	public static void main(String[] args) {
		
		
		// Basic Operations with List [ ArrayList implementation ]
		
		  ListDemo arraylst = new ListDemo();
		  System.out.println("ARRAYLIST OPERATIONS");
		  arraylst.enterData(3);
		  System.out.println("\nDisplaying content based on insertion order");
		  arraylst.displayData(); arraylst.sortByComparable(); arraylst.displayData();
		  arraylst.sortByComparator(); 
		  System.out.println("\nAfter removing 0th element in list :");
		  Series s = arraylst.getSeries(0);
		  arraylst.removeSeries(s); 
		  arraylst.displayData();
		  
		 
		
		// Basic Operations with Set [ Hash implementation of Set ]
		  SetDemo hashset = new SetDemo();
		  System.out.println("\nHASHSET OPERATIONS :");
		  hashset.enterData(3); 
		  hashset.displayData(); 
		  hashset.convertToTreeSet();
		 
		  
		  // Basic Operations with Map [ With Hash implementation ]
		  MapDemo myseries = new MapDemo();
		  System.out.println("\nHASHMAP OPERATIONS");
		  myseries.getData(3);
		  myseries.displayData();
		  myseries.getRatings("GOT");
		
	}

}
