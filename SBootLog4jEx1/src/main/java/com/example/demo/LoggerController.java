package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class LoggerController {
	@Autowired
	Log4jService log4jService;

	@PostMapping("/post")
	public User postData(@RequestBody @Valid User user) {
		return log4jService.post(user);
	}
	@GetMapping("/getAll")
	public List<User> getAllData(@RequestBody User user){
		return log4jService.getAllData(user);
	}
	
	@GetMapping("/get/{id}")
	public User getData(@PathVariable Integer id ,User user) {
		return log4jService.getById(id);
		
	}
	
	
}
