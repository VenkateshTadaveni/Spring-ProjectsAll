package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;



@Controller
public class PersonController {
	@Autowired
	PersonService personService;
	
	
  @GetMapping("/")
	public String homepage() {
		return "home";
	}
	
@GetMapping("/new")
public String registerPerson(Model model) {
	model.addAttribute("person", new Person());
	return "register";
	
}
@PostMapping("/register")
public String saveTheDetails(Person person) {
	personService.saveTheDetails(person);
	
	return "regSuccess";
	
}
@GetMapping("/home")
public String home() {
	return "home";
}
	

}
