package com.example.demo;

import java.util.List;

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
		person.setFirstName("Vennela");
		person.setLastName("Kadari");
		person.setEmail("vennela@gmail.com");
		person.setAge(14);
	
		
		Person person1=new Person();
		person1.setFirstName("Sangeetha");
		person1.setLastName("goolla");
		person1.setEmail("sangeetha@gmail.com");
		person1.setAge(23);
		
		
		Person person2=new Person();
		person2.setFirstName("venky");
		person2.setLastName("tadaveni");
		person2.setEmail("venkat@gmail.com");
		person2.setAge(20);
		
		Person person3=new Person();
		person3.setFirstName("venky");
		person3.setLastName("Tadaveni");
		person3.setEmail("venkatesh@gmail.com");
		person3.setAge(22);
		
		Person person4=new Person();
		person4.setFirstName("venky");
		person4.setLastName("tadaveni");
		person4.setEmail("venkatesh@gmail.com");
		person4.setAge(23);
	
		
		Person person5=new Person();
		person5.setFirstName("Sathosh");
		person5.setLastName("chintu");
		person5.setEmail("santhosh@gmail.com");
		person5.setAge(100);
		personRepository.saveAll(List.of(person,person1,person2,person3,person4,person5));
		
		
	Person person6 =personRepository.findByEmail("venky@gmail.com");
	System.out.println(person4);
	
	personRepository.findByFirstName("venky").forEach((n)->System.out.println(n));
	
	 Person p1=personRepository.findByFirstNameStartingWith("San");
	 System.out.println(p1);
	personRepository.findByLastNameStartingWith("tad").forEach(System.out::println);
	
	Person person7 = personRepository.findByLastNameEndingWith("la");
	System.out.println(person7);
	
	personRepository.findByFirstNameAndLastName("venky", "tadaveni").forEach(System.out::println);
	
	   personRepository.findByFirstNameOrLastName("Santhosh","tadaveni").forEach(System.out::println);

		personRepository.findByAgeGreaterThan(20).forEach(System.out::println);
		personRepository.findByAgeLessThan(20).forEach(System.out::println);
		
		personRepository.deleteByEmail("venkat@gmail.com");
		personRepository.deleteByFirstNameAndLastName("Sathosh","chintu");
		personRepository.deleteByLastName("Tadaveni");
	}
}


