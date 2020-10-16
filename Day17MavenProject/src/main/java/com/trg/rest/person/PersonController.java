package com.trg.rest.person;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/persons")
public class PersonController {

	@Autowired
	PersonDao personDao;
	
	@GetMapping(value = "/", produces = "application/json")
	public List<Person> getAll() {
		return personDao.getPersons();
	}
	
	@GetMapping(value = "/{name}", produces={
			MediaType.APPLICATION_JSON_VALUE, 
            MediaType.APPLICATION_XML_VALUE
            })
	public Person getPersonByName(@PathVariable String name) {
		return personDao.getPersonByName(name);
	}
	
	
	@PostMapping(value="/person", produces="application/json")
	public Person addPerson(@RequestBody Person person){
		System.out.println("in post : " + person);
		return personDao.createPerson(person);
	}
	
	@DeleteMapping(value="/{name}", produces="application/json")
	public Person delPerson(@PathVariable String name){
		return personDao.deletePersonByName(name);
	}
	
	@PutMapping(value="/person", produces="application/json")
	public Person updatePerson(@RequestBody Person person){
		return personDao.updatePerson(person);
	}
	
	/*@GetMapping(value = "/person/{name}", produces = "application/json")
	public ResponseEntity getPersonByName1(@PathVariable String name) {
		Person p =  personDao.getPersonByName(name);
		if(p==null)
			return new ResponseEntity("No Person found for name " + name, HttpStatus.NOT_FOUND);
		else
			return new ResponseEntity(p, HttpStatus.OK);
		
	}*/
	
}
