package day6;

import java.util.HashMap;
import java.util.Set;

public class Student {
	private HashMap<String, String> studNames = new HashMap<>();
	
	public void setNames(String roll, String name) {
		studNames.put(roll, name);
	}
	
	public void printNames() {
		Iterable<String> keys = studNames.keySet();
		for(String key: keys)
			System.out.println(key+" "+studNames.get(key));
		
	}
	
	public void getName(String key) throws RollNoOutOfBoundException {
		String value = studNames.get(key);
		if (value != null)
			System.out.println(value);
		else
			throw new RollNoOutOfBoundException();
	}
	
	public void printSize() {
		System.out.println(studNames.size());
	}
	
	public void remove(String key) {
		studNames.remove(key);	
	}
}
