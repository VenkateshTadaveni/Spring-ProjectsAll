package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome this endPoint is not secure";
		
	}
	@PostMapping("/new")
	public String addNewUser(@RequestBody User_info userInfo) {
		return productService.addUser(userInfo);
		
	}

}
