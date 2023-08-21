 package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	@RequestMapping( value="/wish",method=RequestMethod.GET)
	public String info(Model model) {
		
	
	Person person=new Person("Venkatesh", "tadaveni", "Venky@gmail.com");
	model.addAttribute("person",person);
	
	return "object";
 }

	@RequestMapping( value="/info",method=RequestMethod.GET)
	public String value(Model model) {
	List<Person> persons=List.of(new Person("Venkatesh", "tadaveni", "Venky@gmail.com"),
				new Person("Venkatesh", "tadaveni", "Venky@gmail.com"),
				new Person("Venkatesh", "tadaveni", "Venky@gmail.com"));
		model.addAttribute("persons",persons);
		return "data";
	}
}
