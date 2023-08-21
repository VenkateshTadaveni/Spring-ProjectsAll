package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	
	@GetMapping("/")
	public String wish() {
		return "product";
}
	
	@PostMapping("/process")
public String Product(@RequestParam String pName,@RequestParam double pCost,@RequestParam int pQuantity,Model model)
	{
		Product product=productService.info(pName, pCost, pQuantity);
		 model.addAttribute("product", product);
		
		return "bill";	
	}

}
