package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "This is SpringBoot First Application..";
	}
	
	@RequestMapping("/info")
	@ResponseBody

	public String info() {
		return "This is checking info method..";
	}
	
	@RequestMapping("/wish")
	public String wishes() {
		return "wish";
	}
	
	
}
