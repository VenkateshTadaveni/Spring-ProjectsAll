package com.example.demo;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.validation.Valid;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public String saveData( User user) {
		UserEntity userEntity =new UserEntity();
	BeanUtils.copyProperties(user, userEntity);
	
   if(userRepository.save(userEntity)!=null) {
	   return "Data inserted Successfully in database";
   }
   else {
	   return "Data not inserted in database";
   }
	}
	
	public List<UserEntity> getData(User user) {

	UserEntity userEntity1=new UserEntity();
		
		BeanUtils.copyProperties(userEntity1, user);

		List<UserEntity> users=userRepository.findAll();
		return users;
		

	}
	
	public User getAll(Integer id) throws UserNotFoundException {
		UserEntity userEntity=userRepository.findById(id).get();
		
	if(userEntity!=null) {
		User user=new User(); 
		BeanUtils.copyProperties(userEntity, user);
		return user;
		
	}
	else {
		throw new UserNotFoundException("the User data not present in this id");
		
	}
		
	}

	
	
	
	
	

}
