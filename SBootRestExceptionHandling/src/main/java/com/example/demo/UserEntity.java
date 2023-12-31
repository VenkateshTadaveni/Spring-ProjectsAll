package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="user_info")

public class UserEntity {
	
	@Id
	@GeneratedValue
	private Integer userId;
	private String name;
	private Integer age;
	private String email;
	private String mobileno;
	private String gender;
	private String nationality;
	

}
