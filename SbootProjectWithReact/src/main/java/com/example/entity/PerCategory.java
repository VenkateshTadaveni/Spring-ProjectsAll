package com.example.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="per_category")
@Table
public class PerCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String pCategory;
	private double discount;
	private double gst;
	private int deliveryCharge;

}
