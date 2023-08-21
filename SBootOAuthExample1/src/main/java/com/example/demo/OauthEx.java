package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OauthEx {
	
	@GetMapping("/")
	public String Homepage() {
		return "Welcome to Oauth Authorization Example...";
	}
	
	@GetMapping("/get")
	public String Wish() {
		return "This is OAuth Authorization Grant Succussed...";
	}

}
