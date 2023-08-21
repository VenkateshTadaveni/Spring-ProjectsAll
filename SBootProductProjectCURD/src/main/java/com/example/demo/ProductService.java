package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;

	public List<Product> getData(){
   return  productRepository.findAll();
		}

	public void saveData(Product product) {
		
	 productRepository.save(product);
		
	}

	public Product editById(Long id) {
	  return productRepository.findById(id).get();
		
	}

	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
		
	}

	
}
