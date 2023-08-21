package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProuductController {
	
	@Autowired
	ProductService productService;
	@GetMapping("/")
	public String info() {
		return "Product";	
	}
	
	@PostMapping("/Productprocess")
	public String product(@RequestParam String pName,@RequestParam double pPrice,@RequestParam int pQuantity,Model model ) {
		
		Product product=  productService.productCheck(pName, pPrice, pQuantity);
		model.addAttribute("product",product);
		return "bill-info";
				
				
	}
}
