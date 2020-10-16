package com.trg.rest.person;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class PersonDao {
	List<Person> personlist = new ArrayList<>();

	public PersonDao() {
		personlist.add(new Person("Anita", 50));
		personlist.add(new Person("Sunita", 45));
		personlist.add(new Person("Kavita", 30));
	}

	public List<Person> getPersons() {
		return personlist;
	}

	public Person getPersonByName(String name) {
		Person returnperson = null;
		for (Person p : personlist) {
			if (p.getPname().equals(name)) {
				returnperson = p;
				break;
			}
		}
		return returnperson;
	}

	public Person createPerson(Person p) {
		personlist.add(p);
		System.out.println("in dao : " + p);
		return p;
	}

	public Person deletePersonByName(String name) {
		Person returnperson = null;
		for (Person p : personlist) {
			if (p.getPname().equals(name)) {
				returnperson = p;
				personlist.remove(p);
				break;
			}
		}
		return returnperson;
	}

	public Person updatePerson(Person person) {
		Person returnperson = null;
		for (Person p : personlist) {
			if (p.getPname().equals(person.getPname())) {
				p.setAge(person.getAge());
				returnperson = p;
				break;
			}
		}
		return returnperson;
	}
}
