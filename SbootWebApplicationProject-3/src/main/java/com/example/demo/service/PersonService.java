package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Person;
import com.example.demo.repo.PersonRepo;

@Service
public class PersonService {
	@Autowired
	PersonRepo personRepo;

	public void saveTheDetails(Person person) {
		personRepo.save(person);
		
	}

}
