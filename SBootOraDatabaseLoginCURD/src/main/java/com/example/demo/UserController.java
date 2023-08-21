package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	
	@GetMapping("/")
	public String homePage(Model model) {
		List<User> user=userService.getDetails();
		model.addAttribute("user",user);
		return "login";
	}
	
	
	@GetMapping("/rigister")
	public String rigisterData(Model model) {
		model.addAttribute("rigister", new Rigister());
		return "rigistartion";
		
	}
	
//	@PostMapping("/save")
//	public String rigisterUser(Rigister rigister) {
//		userService.saveData(rigister);
//
//		return "redirect:/login:sucess";
//	}

}
