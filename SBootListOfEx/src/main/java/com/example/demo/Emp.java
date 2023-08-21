package com.example.demo;

public class Emp {
	private int eid;
	private String ename;
	private String email;
	private double salary;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Emp(int eid, String ename, String email, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
		this.salary = salary;
	}

}
