package day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PersonDriver {
	public static void main(String[] args) {
		Set <Person> persons = new TreeSet<Person>();
		
		persons.add(new Person(11,"aaa",30));
		persons.add(new Person(2,"aaa",31));
		persons.add(new Person(3,"aaa",32));
	
		Iterator<Person> it = persons.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		
		
	}
}
