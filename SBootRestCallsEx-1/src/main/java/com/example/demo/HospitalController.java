package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HospitalController {
	@Autowired
	HospitalService hospitalService;
	
	@PostMapping("/save")
	public Hospital Save(@RequestBody  Hospital hospital){
		return hospitalService.saveData(hospital);
	}
	
	@GetMapping("/get")
	public List<Hospital> getData(Hospital hospital){
		return hospitalService.getAllData();
		
	}
	@GetMapping("/based/{id}")
	public Hospital getById(@PathVariable int id) {
		 return hospitalService.getBYUserID(id);
	
	}

	@GetMapping("/rating/{rating}")
	
	public List<Hospital> getByRating( @PathVariable double rating) {
		return  hospitalService.getByRating(rating);
 
	}
	
	@GetMapping("/name/{name}")
	public List<Hospital> getByName( @PathVariable String name) {
		 return hospitalService.getBYName(name);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable int id) {
		return hospitalService.deleteById(id);
	}
	
	@GetMapping("/base/{id}/{location}")
	public Hospital getByLocAndRating(@PathVariable String location,@PathVariable int id) {
		return	hospitalService.getByLocAndRating(id,location);
			}
	
	
	@PutMapping("/update/{id}")
	public Hospital updateById(@PathVariable Integer id,@RequestBody Hospital newHospital ) {
		return hospitalService.updateById(id, newHospital);
		
	}
		
}
