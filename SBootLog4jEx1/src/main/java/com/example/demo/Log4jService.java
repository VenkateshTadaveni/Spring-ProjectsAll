package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Service;

import jakarta.validation.Valid;

@Service
public class Log4jService {
	
	
   public static Logger logger=Logger.getLogger(Log4jService.class);
   
   List<User> users=new ArrayList<User>(Arrays.asList(new User(111,"Venky","venkymail.com"),
		                                               new User(222,"Akka","Akka@gmail.com")));

	public User post(@Valid User user) {
		logger.info("The Data added Succesfully..."+user);
		return users.add(user)?user:null;
	}

	public List<User> getAllData(User user) {
		if(users.isEmpty()) {
			logger.info("The list if user information is.."+users);
		
		return users;
		
		}
		else {
			logger.error("No data present...");
			return users;
		}
	}

	public User getById(Integer id) {
	try {
			User user=users.stream().filter(n->n.getId()==id).findAny().get();
			logger.info("data information is..."+user);
			return user;
		
		} catch (NoSuchElementException e) {
			logger.error("Thir is no data.."+e);
			return null;	
		}
	
	}
	
	
	

}
