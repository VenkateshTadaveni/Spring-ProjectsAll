package com.example.demo;

public class Product {
	
	private String pName;
	private double pPrice;
	private int pQuantity;
	private double totalBill;
	private double discount;
	private double netAmount;
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpPrice() {
		return pPrice;
	}
	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}
	public int getpQuantity() {
		return pQuantity;
	}
	public void setpQuantity(int pQuantity) {
		this.pQuantity = pQuantity;
	}
	public double getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getNetAmount() {
		return netAmount;
	}
	public void setNetAmount(double netAmount) {
		this.netAmount = netAmount;
	}
	public Product(String pName, double pPrice, int pQuantity, double totalBill, double discount, double netAmount) {
		super();
		this.pName = pName;
		this.pPrice = pPrice;
		this.pQuantity = pQuantity;
		this.totalBill = totalBill;
		this.discount = discount;
		this.netAmount = netAmount;
	}
	

}
