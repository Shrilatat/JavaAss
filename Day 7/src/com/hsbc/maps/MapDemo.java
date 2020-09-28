package com.hsbc.maps;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Jan");
		map.put(2, "Feb");
		map.put(3, "Mar");
		map.put(4, "Apr");
		map.put(5, "May");

//		System.out.println(map.get(1));

		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
	}

}
