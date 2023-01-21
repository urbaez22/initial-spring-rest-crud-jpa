package com.example.testjpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.testjpa.dto.PersonDTO;
import com.example.testjpa.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	PersonService personService;

	@GetMapping("/{id}")
	public PersonDTO get(@PathVariable Long id) {
		return personService.get(id);
	}
	
	@PostMapping("/")
	public void create(@RequestBody PersonDTO person) {
		personService.create(person);
	}
	
	@PutMapping("/")
	public void update(@RequestBody PersonDTO person) {
		personService.update(person);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		personService.delete(id);
	}

}
