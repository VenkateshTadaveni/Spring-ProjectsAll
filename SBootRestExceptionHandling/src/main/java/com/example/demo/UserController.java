package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@PostMapping("/fetch")
	public String SaveData(@RequestBody @Valid User user) {
		return userService.saveData(user);
	}
	
	@GetMapping("/get")
public List<UserEntity> getData(User user){
		
		return userService.getData(user);	
	}
	

	@GetMapping("/fetch/{id}")
	public User getAllUsers(Integer id)throws UserNotFoundException {
		return userService.getAll(id);
	}
	

	
	
}
