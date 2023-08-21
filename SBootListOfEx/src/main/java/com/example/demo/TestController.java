package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("/name")
	public String method(Model model) {
		model.addAttribute("name","This is Tadaveni Venkatesh");
		model.addAttribute("Location","Hydherabad");
		return "info";
	}
	@RequestMapping("/one")
	public String oneObject(Model model) {
		 Emp emp=new Emp(123,"Venkatesh","Tadaveni",108000.0);
		model.addAttribute("emp",emp);
		return "singleValue";
	}
	@RequestMapping("/group")
	public String listOfObject(Model model) {
		List<Emp> emps=List.of(new Emp(123, "Venkatesh","Karimnagar",108800.0),
				new Emp(124, "SaiPawan","EastGodhavari",108800.0),
				new Emp(125, "Santhosh","EastGodhavari",108800.0),
				new Emp(126, "Kalyan","Kotthagudem",108800.0));
		model.addAttribute("emps",emps);
		return "false";
	}
	
	
	
	

}
