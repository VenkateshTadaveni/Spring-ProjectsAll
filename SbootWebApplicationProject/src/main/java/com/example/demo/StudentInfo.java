package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StudentInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sId;
	private String sName;

	private String sEmail;

	private String sPass;

	private String sMobile;

}
