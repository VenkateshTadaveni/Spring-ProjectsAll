package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Product;
import com.example.repo.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;

	public Product saveTheProduct(Product product) {
		Product product1=productRepository.save(product);
		return saveTheProduct(product);
	}

}
