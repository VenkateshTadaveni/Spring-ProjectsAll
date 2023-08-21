package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	//@Autowired
	//LoginService loginService;
	
 @GetMapping("/login")
 public String info() {
	 return "login"; 	 
 }
	@PostMapping("/loginProcess")
	public String loginprocess(@RequestParam String username,@RequestParam String password)
	{
		
		
//return LoginService.loginCheck(username, password);
	
if(username.equals("venky")&&password.equals("venky")) {
			return "redirect:/login?success";
	}
		else
		{
			return"redirect:/login?error";
	}	
	}
}
