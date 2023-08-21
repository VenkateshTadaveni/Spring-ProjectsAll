package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Person_in123")
@Table
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int pId;
	private String name;
	private String email;
	private String desg;
	private String dept;
}
