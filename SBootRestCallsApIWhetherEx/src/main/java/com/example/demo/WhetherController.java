package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhetherController {
	@Autowired
	WetherService wetherService;
@GetMapping("/get/{location}")
	public String getWhethet(@PathVariable String location) {
		return wetherService.getData(location);
	
}
	
	
	
	
}
