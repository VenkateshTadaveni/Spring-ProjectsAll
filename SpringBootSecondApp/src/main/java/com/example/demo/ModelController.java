package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/v")
public class ModelController {
	@RequestMapping("/test")
	public String info(Model model) {
		model.addAttribute("message", "Hi hello");
		model.addAttribute("index", "This is Hydherabad");
	
		return "info";

	}
	@RequestMapping("/url")
	public String value() {
		return "value";
	}
	@RequestMapping("/info")
	public String personList(Model model) {
		List<Person>persons=List.of(new Person("Venky","Tadaveni", "venky@gmial.com"),
				                     new Person("sai", "pawan", "saipawan@gamil.com"),
				                     new Person("balu","elora","Baluelora@gmail.com"));
		
		model.addAttribute("persons", persons);
		return "personList";
		
	}
	

}
