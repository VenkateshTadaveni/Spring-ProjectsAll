package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
UserRepository userRepository;
	
	
	public List<User> getDetails() {
		
		return userRepository.findAll();
	}

//	public void saveData(Rigister rigister) {
//		
//		userRepository.save(rigister);
//		}

	
}
