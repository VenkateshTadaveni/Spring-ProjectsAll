package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Product;
import com.example.service.ProductService;


@RestController
public class ProductController {
	
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/post")
	public Product SaveForDetails(@RequestBody Product product) {
		Product product1 = productService.saveTheProduct(product);
		return product1;
	}

}
