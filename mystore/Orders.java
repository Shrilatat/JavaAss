package mystore;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Orders {

	public static void main(String[] args) {
		// Each order must have its Number and Contents
		// Owner pushes all orders here for later analysis
		TreeMap<Integer, ArrayList<Goods>> myOrders = new TreeMap<>();

		// One object for every customer who wants to shop
		ArrayList<Goods> customer1 = new ArrayList<>();
		ArrayList<Goods> customer2 = new ArrayList<>();
		ArrayList<Goods> customer3 = new ArrayList<>();

		// Customers buy what they want, We store their order details in their object
		customer1.add(new FoodItem(1, "apple", 10, 10, new Date(2019, 1, 1), new Date(2020, 10, 10)));
		customer1.add(new FoodItem(2, "orange", 10, 20, new Date(2014, 2, 3), new Date(2015, 2, 3)));
		customer1.add(new FoodItem(7, "mango", 10, 20, new Date(2014, 2, 3), new Date(2015, 2, 3)));

		customer2.add(new Electronics(3, "phone", 1, 10000, 12));
		customer2.add(new Electronics(4, "laptop", 2, 30000, 12));
		customer2.add(new Electronics(8, "television", 2, 30000, 12));

		customer3.add(new Apparel(5, "shirt", 2, 500, MATERIAL.cotton, SIZE.medium));
		customer3.add(new Apparel(6, "hat", 3, 1500, MATERIAL.woolen, SIZE.large));
		customer3.add(new Apparel(9, "another shirt", 3, 1500, MATERIAL.woolen, SIZE.large));

		// Push customers orders in the system
		myOrders.put(1, customer1);
		myOrders.put(2, customer2);
		myOrders.put(3, customer3);
		
		// To Print Everything
		for(Map.Entry<Integer,ArrayList<Goods>> entry : myOrders.entrySet()) {
			  Integer key = entry.getKey();
			  ArrayList<Goods> value = entry.getValue();
			  System.out.println(key + " => " + value);
			}
		
		// System.out.println("Enter Category");
		// String showCat;
		// Scanner scan = new Scanner(System.in);
		// Store owner must enter Category correctly (Refer to Enum file)
		// showCat = scan.next();
		// To Print Specific
		
		/*
		 * 		for(Map.Entry<Integer,ArrayList<Goods>> entry : myOrders.entrySet()) {
			if() {
				  Integer key = entry.getKey();
				  ArrayList<Goods> value = entry.getValue();
				  System.out.println(key + " => " + value);
			}

		}
		 * 
		 * */
		


			

	}
}
