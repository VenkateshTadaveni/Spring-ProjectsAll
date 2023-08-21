package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;
@Repository
public interface PersonRepository extends JpaRepository<Person,Long>{
	
	public Person findByEmail(String email); 
		
	public List<Person> findByFirstName(String firstName);
	public List<Person> findByLastName(String lastName);
	public Person findByFirstNameStartingWith(String firstName);

	public List<Person> findByLastNameStartingWith(String lastName);
	
	
	public Person findByLastNameEndingWith(String lastName);
	public List<Person> findByFirstNameAndLastName(String firstName,String lastName);
	
	public List<Person> findByFirstNameOrLastName(String firstName,String lastName);
	
public List<Person> findByAgeGreaterThan(int age);

public List<Person> findByAgeLessThan(int age);

@Transactional
public void deleteByEmail(String email);
@Transactional
public void deleteByLastName(String lastName);
@Transactional
public void deleteByFirstNameAndLastName(String firstName,String lastName);


	

}
