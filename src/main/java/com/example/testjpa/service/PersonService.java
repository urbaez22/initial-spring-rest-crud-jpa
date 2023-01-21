package com.example.testjpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.testjpa.dto.PersonDTO;
import com.example.testjpa.model.entity.Person;
import com.example.testjpa.model.entity.mapper.PersonMapper;
import com.example.testjpa.model.repository.PersonRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PersonService {
	
	@Autowired
	PersonRepository personRepo;
	
	@Autowired
	PersonMapper personMapper;
	
	public PersonDTO get(Long personId) {
		Optional<Person> p = personRepo.findById(personId);
		if (p != null && p.isPresent())
			return new PersonDTO(p.get());
		else
			return null;
	}
	
	public void create(PersonDTO p) {
		personRepo.save(p.toPerson());
	}
	
	public void update(PersonDTO dto) {
		Optional<Person> p = personRepo.findById(dto.getId());
		if (p != null && p.isPresent()) {
			Person person = p.get();
			personMapper.updatePersonFromDto(dto, person);
			personRepo.save(person);
		}
	}
	
	public void delete(Long id) {
		personRepo.deleteById(id);;
	}
}
