package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class BootRunner  implements CommandLineRunner{
	
	
	@Autowired
	EmpRepository empRepository;

	@Override
	public void run(String... args) throws Exception {
		Emp emp=new Emp();
		emp.setFirstName("Venkatesh");
		emp.setLastName("tadaveni");
		emp.setEmail("venky@gmail.com");
		empRepository.save(emp);
	
		Emp emp1=new Emp();
		emp1.setFirstName("vennela");
		emp1.setLastName("kadari");
		emp1.setEmail("vennala@gmail.com");
		
	
		Emp emp2=new Emp();
		emp2.setFirstName("Sangeetha");
		emp2.setLastName("Goolla");
		emp2.setEmail("Sangeetha@gmail.com");
		empRepository.saveAll(List.of(emp1,emp2));
	
		long xyz= empRepository.count();
		System.out.println(xyz);
		
		Emp emp3=empRepository.findById(2).get();
		System.out.println(emp3);
		empRepository.findAll().forEach((n)->System.out.println(n));
		
		
		

}
}