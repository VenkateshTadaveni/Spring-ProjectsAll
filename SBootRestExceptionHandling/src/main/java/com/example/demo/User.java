package com.example.demo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@NotNull(message = "the User Name should not be null")
	private String name;
	@Min(18)@Max(45)
	private Integer age;
	@Email(message = "the email should not be null")
	private String email;
	@Pattern(regexp = "^\\d{10}", message = "the no must be ten numbers")
	private String mobileno;
	
	private String gender;
	@NotBlank
	private String nationolity;
	
}
