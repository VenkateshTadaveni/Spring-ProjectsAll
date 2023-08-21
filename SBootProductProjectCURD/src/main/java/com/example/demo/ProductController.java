package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
	@Autowired
	ProductService productService;
	
	
	@GetMapping("/")
	public String homePage(Model model) {
		List<Product> product=productService.getData();
	model.addAttribute("product",product);
	return "hello";
	}
	
	@GetMapping("/new")
	public String createPerson(Model model) {
		model.addAttribute("product",new Product());
	return "newCreate";
	
	}

	@PostMapping("/save")
	public String saveData(Product product) {

		productService.saveData(product);

		return "redirect:/";
	}
	
	
	@GetMapping("/delete/{id}")
	public String deleteProduct( @PathVariable long id) {
		productService.deleteProduct(id);
		return "redirect:/";
		
	}
	
	@GetMapping("/edit/{id}")
	public String editData(@PathVariable long id,Model model) {
		Product product=productService.editById(id);
		model.addAttribute("product", product);
		
		return "edit";
		
		
	}
	
	

}
