package com.hsbc.map;

import java.util.HashMap;
import java.util.Map;


public class mapdemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Jan");
		map.put(2, "Feb");
		map.put(3, "Mar");
		map.put(4, "Apr");
		map.put(5, "May");

		for(Integer i : map.keySet()) {
			System.out.println("Key " + i + " Value " + map.get(i));
		}
		
	}

}
