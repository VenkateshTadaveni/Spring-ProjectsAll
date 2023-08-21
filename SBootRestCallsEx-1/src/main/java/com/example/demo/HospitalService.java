package com.example.demo;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service

public class HospitalService {

	List<Hospital> hospitals = new ArrayList<Hospital>(Arrays.asList(new Hospital(111, "Apollo", "Hydherabad", 3.4),
			new Hospital(222, "kims", "HitechCity", 2.4), new Hospital(324, "Yashodha", "Hydherabad", 5.4)));

	public Hospital saveData(Hospital hospital) {

		hospitals.add(hospital);
		return hospital;
	}

	public List<Hospital> getAllData() {
		return hospitals;
	}

	public Hospital getBYUserID(int id) {
		return hospitals.stream().filter(t -> t.getId() == id).findFirst().get();

	}

	public List<Hospital> getByRating(double rating) {
		return hospitals.stream().filter(n->n.getRating()>rating).collect(Collectors.toList());
	}

	public List<Hospital> getBYName(String name) {
		return hospitals.stream().filter(n->n.getName().equalsIgnoreCase(name)).collect(Collectors.toList());
	
	}

	public String deleteById(int id) {
	Hospital h= hospitals.stream().filter(n->n.getId()==id).findAny().get();
	return hospitals.remove(h)?"deleted Successfully":"not deleted check it and try again";
	 
		
	}

	public Hospital getByLocAndRating(@PathVariable int id, @PathVariable String  location) {
		 return hospitals.stream().filter(r->r.getId()==id).filter(n->n.getLocation().equals(location)).findAny().get();
		
	}

	

	public Hospital updateById(Integer id, Hospital newHospital) {
		Hospital user=hospitals.stream().filter(n->n.getId()==id).findFirst().get();		
		user.setId(newHospital.getId());
		user.setName(newHospital.getName());
		user.setLocation(newHospital.getLocation());
		user.setRating(newHospital.getRating());
		  return user;
			}

}
