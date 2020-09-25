package day7;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class MapDemo {
public static void main(String[] args) {
	Map<Integer,String> map=new HashMap<>();
	map.put(1,"Monday");
	map.put(2,"Tuesday");
	map.put(3,"Wednesday");
	map.put(4,"Thursday");
	
	//System.out.println(map.get(2));
	
	//iterate through the map
	//Step1: retrive all key to a set
	
	Set<Integer> keys=map.keySet();
	for(int key:keys) {
		System.out.println(key+" "+map.get(key));
	}
}
}
