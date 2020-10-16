package student;

import java.util.HashMap;
import java.util.Iterator;

public class Student {
	// Roll Number, Name
	private HashMap<String,Integer> myMap = new HashMap<>();
	
	public void setName(int id, String name) {
		myMap.put(name, id);
	}
	
	public void printNames() {
		for(String a : myMap.keySet()) {
			System.out.println(a);
		}
	}
	
	public void getName(String key) {
		System.out.println(myMap.get(key));
	}
	
	public void printSize() {
		int i = 0;
		for(String key : myMap.keySet()) {
			i++;
		}
		System.out.println("The size is" +i);
	}
	
	public void remokeyve(String key) {
		for(String a: myMap.keySet()) {
			if(a == key)
				myMap.remove(key);
		}
	}
	
	public static void main(String[] args) {
		
	}
}
