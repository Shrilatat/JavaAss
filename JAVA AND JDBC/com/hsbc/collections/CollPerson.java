package com.hsbc.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollPerson {

	public static void main(String[] args) {
		List<Preson> persons = new ArrayList<>();
		
		persons.add(new Preson(1,"aaa",30));
		persons.add(new Preson(2,"bbb",31));
		persons.add(new Preson(3,"ccc",32));
		persons.add(new Preson(4,"ddd",33));
		
		for (Preson preson : persons) {
			System.out.println(preson);
		}
		
		Iterator<Preson> it = persons.iterator();
		
		while(it.hasNext()){
			
			Preson p = it.next();
			if(p.getAge() == 30)
				System.out.println(it);
		}
	}

}
