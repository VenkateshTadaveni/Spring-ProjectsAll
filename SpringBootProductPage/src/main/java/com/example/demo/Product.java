package com.example.demo;

public class Product {
	private String pName;
	private double pCost;
	private int pQuantity;
	private double totalBil;

	private double discout;
     private double netAmount;
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getpCost() {
		return pCost;
	}
	public void setpCost(double pCost) {
		this.pCost = pCost;
	}
	public int getpQuantity() {
		return pQuantity;
	}
	public void setpQuantity(int pQuantity) {
		this.pQuantity = pQuantity;
	}
	public double getTotalBil() {
		return totalBil;
	}
	public void setTotalBil(double totalBil) {
		this.totalBil = totalBil;
	}
	public double getDiscout() {
		return discout;
	}
	public void setDiscout(double discout) {
		this.discout = discout;
	}
	public double getNetAmount() {
		return netAmount;
	}
	public void setNetAmount(double netAmount) {
		this.netAmount = netAmount;
	}
	public Product(String pName, double pCost, int pQuantity, double totalBil, double discout, double netAmount) {
		super();
		this.pName = pName;
		this.pCost = pCost;
		this.pQuantity = pQuantity;
		this.totalBil = totalBil;
		this.discout = discout;
		this.netAmount = netAmount;
	}
     
     
}
