package com.hsbc.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();
		
		map.put(1, "HSBC");
		map.put(2, "BANK");
		
		System.out.println(map);
		
		Set<Integer> keys = map.keySet();

		for(Integer i : keys)
			System.out.println(i + " " + map.get(i));
	}
}
