package com.example.demo;

public class Teacher {
	private String name;
	private String subject;
	private long mobileno;
	public Teacher(String name, String subject, long mobileno) {
		super();
		this.name = name;
		this.subject = subject;
		this.mobileno = mobileno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	
	

}
