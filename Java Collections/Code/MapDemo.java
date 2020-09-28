package com.examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapDemo {
	
	private HashMap<String, Integer> myseries = new HashMap<>();
	private Scanner sc = new Scanner(System.in);
	
	//Get Data
	public void getData(int num) {
		while(num!=0) {
			System.out.println("Enter Series name and ratings as key value pairs ");
				
			myseries.put(sc.nextLine(), Integer.parseInt(sc.nextLine()));
			num--;
		}
	}
	
	// Get Ratings
	public void getRatings(String name) {
		System.out.println("\nThe value[rating] for "+name+ " key is :");
		System.out.println(myseries.get(name));
	}
	
	//Display Data
	public void displayData() {
		
		Set set = myseries.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry mapentry = (Map.Entry) itr.next();
			System.out.println("[Key,Value]:"+ mapentry.getKey()+ "  "+mapentry.getValue());
		}
	}
	
}
