package com.example.demo;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private Integer id;
	@Column
	@NotBlank(message="name should not be null...")
	private String name;
	@Column
	@Email(message = "email should not be null...")
    private String email;
}
