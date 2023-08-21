package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
	public Product productCheck(String pName, double pPrice, int pQuantity) {
		double totalBill = pPrice * pQuantity;
		double discount = 0, netBill = 0;

		if (totalBill < 1000) {
			discount = totalBill * 0.05;
			netBill = discount - totalBill;
		} else if (totalBill > 1000 && totalBill < 5000) {
			discount = totalBill * 0.10;
			netBill = discount - totalBill;

		} else {
			discount = totalBill * 0.15;
			netBill = discount - totalBill;
		}
		Product product = new Product(pName, pPrice, pQuantity, totalBill, discount, netBill);
		return product;
	}
}
