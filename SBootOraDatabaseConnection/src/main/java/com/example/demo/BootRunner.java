package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class BootRunner implements CommandLineRunner{
	@Autowired
	PersonRepository personRepository;

	@Override
	public void run(String... args) throws Exception {

		  Person person=new Person();
		    
		    person.setFirstName("Venkatesh");
		    person.setLastName("Tadaveni");
		    person.setEmail("Venkatesh@gamil.com");
		    person.setMobileNo(9515761770l);
		    personRepository.save(person);
		
		
	}
	
	
	
	
	
	
	
	
}
