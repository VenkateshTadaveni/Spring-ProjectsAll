package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SivaController {
	
	@Autowired
	SivaService sivaService;
	
	@GetMapping("/")
	public String homepage()
	{
		return "home";
		}

}
