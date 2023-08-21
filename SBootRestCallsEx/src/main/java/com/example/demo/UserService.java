package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	List<User>users=new ArrayList<User>(Arrays.asList(new User(111l,"venky","tadaveni","venky@gamil.com"),
			                                             new User(22l,"vennela","kadari","vennela@gmail.com"),
			                                             new User(333l,"sangeetha","goolla","sangeetha@gamil.com"),
			                                             new User(444l,"Akki","akki","Akki@gmail.com")));

	public User saveData(User user) {
		return users.add(user) ? user : null;
	}

	public List<User> getAllUsers() {

		return users;
	}

	public User getbyUserId(long id) {
		return users.stream().filter(user -> user.getId() == id).findAny().get();
	}

	public boolean deleteByUser(long id) {
		User user1 = users.stream().filter(n -> n.getId() == id).findFirst().get();
		return users.remove(user1);

	}

}
