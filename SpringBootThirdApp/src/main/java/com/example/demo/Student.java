package com.example.demo;

public class Student {
	private int sid;
	private String sName;
	private double sMarks;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public double getsMarks() {
		return sMarks;
	}
	public void setsMarks(double sMarks) {
		this.sMarks = sMarks;
	}
	public Student(int sid, String sName, double sMarks) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.sMarks = sMarks;
	}
	

}
