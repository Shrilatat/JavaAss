package day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map <Integer,String> map = new HashMap<>();
		map.put(1, "Jan");
		map.put(2, "fEB");
		
		System.out.println(map.get(1));
		
		map.put(3, "march");
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		for (Integer key : keys) {
			System.out.println(key+ " : "+map.get(key));
		}
	}
}
