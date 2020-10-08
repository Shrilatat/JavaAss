package com.trg.restclient;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.trg.rest.person.Person;

public class PersonRestClient {
	static final String REST_URI = "http://localhost:8085/SpringRESTApp2018/persons";

	private static void listAllPersonss() {
		System.out.println("\n Testing listAllPersons API-----------");

		RestTemplate restTemplate = new RestTemplate();
		List<LinkedHashMap<String, Object>> personsMap = 
				restTemplate.getForObject(REST_URI + "/", List.class);

		if (personsMap != null) {
			for (LinkedHashMap<String, Object> map : personsMap)
				System.out.println("Person:name=" + map.get("pname") + 
						                   ", Age=" + map.get("age"));
		} else
			System.out.println("No user exists----------");
	}

	private static void getPerson() {
		System.out.println("\n Testing getPerson API----------");
		RestTemplate restTemplate = new RestTemplate();
		Person person = restTemplate.getForObject(REST_URI + "/Anita", Person.class);
		System.out.println(person);
	}

	private static void createPerson() {
		System.out.println("\n Testing create User API----------");
		RestTemplate restTemplate = new RestTemplate();
		Person newperson = new Person("Shrilata", 30);
		Person createdPerson = 
				restTemplate.postForObject(REST_URI + "/person", newperson, Person.class);
		System.out.println("Newly created person : " + createdPerson);
	}

	public static void main(String args[]) {
		listAllPersonss();
		getPerson();
		createPerson();
		listAllPersonss();

	}
}
