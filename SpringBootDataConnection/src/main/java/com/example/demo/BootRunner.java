package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class BootRunner  implements CommandLineRunner{
	
	@Autowired
	EmpRepository empRepository;
	

	@Override
	public void run(String... args) throws Exception {
		Employee employee= new Employee();
		employee.setFirstName("Venkatesh");
		employee.setLastName("Tadaveni");
		employee.setEmail("venky@gmial.com");
		empRepository.save()
	}
		
	}
	


