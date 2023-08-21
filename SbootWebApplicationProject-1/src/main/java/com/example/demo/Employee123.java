package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee123_info")
public class Employee123 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long empId;
	@Column
	private String name;
	@Column
	private String email;
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee123 [empId=" + empId + ", name=" + name + ", email=" + email + "]";
	}
	
	

}
