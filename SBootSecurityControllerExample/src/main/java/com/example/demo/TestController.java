package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class TestController {
	
	@GetMapping("/")
	public String show() {
		return "<h1>Welcome to the HomePage</h1> "+
	     "<br><a href='/admin'>Click here to go Admin Details</a>"+
				"<br><a href='/user'>Click here to go User Deatials</a>";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "This is the Admin Portal"+
	"<br><a href='/logOut'>Click Here to LogOut</a>";
		
	}
	@GetMapping("/user")
	public String user() {
		return "This Is User Details....."+
	"<br><a href='/logOut'>Click Here to LogOut</a>";
		
	}
	@PostMapping("/logOut")
	public String logOut() {
		return "redirect?:/";
	}
	

}
