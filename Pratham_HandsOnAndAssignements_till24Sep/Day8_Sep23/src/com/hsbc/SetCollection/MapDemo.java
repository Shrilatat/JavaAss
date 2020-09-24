package com.hsbc.SetCollection;

import java.util.*;

public class MapDemo {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1,"January");
		map.put(2,"Feb");
		map.put(3,"March");
		
		System.out.println(map.get(2));
		
		Set<Integer> keys = map.keySet();
		for(Integer key: keys) {
			System.out.println(key+":"+map.get(key));
		}
	
		
	}
}
