package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@PostMapping("/saveuser")
	public User info(@RequestBody User user) {
		return userService.saveData(user);
	}
	
     @GetMapping("/users")
	public List<User> getAllUsers(){
	 return	userService.getAllUsers();
	}
	
	@GetMapping("/user/{id}")
	public User getUser(long id) {
	return	userService.getbyUserId(id);
	}
	

     @DeleteMapping("/delete/{id}")
     public String deleteUser(@PathVariable long id) {
	 return userService.deleteByUser(id)?"deleted":"not deleted";
	
}
       
       


}
