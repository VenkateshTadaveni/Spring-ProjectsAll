package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	public Product info(String pName,double pCost,int pQuantity) 
	{
		double total=pCost*pQuantity;
		double discount=0,netAmountPAy=0;
		
		if(total<1000) {
			discount=total*0.05;
			netAmountPAy=total-discount;
		}
		else if(total>1000&&total<5000) {
			discount=total*0.10;
			netAmountPAy=total-discount;
		}
		else {
			discount=total*0.15;
			netAmountPAy=total-discount;
		}
		
		Product product=new Product(pName, pCost, pQuantity, total, discount, netAmountPAy);
		return product;
	
	}
}
