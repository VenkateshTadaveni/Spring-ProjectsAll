package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public static String loginCheck(String username, String password) {
		if (username.equals("venky") && password.equals("venky")) {
			return "success";
		} else {
			return "error";
		}

	}

}
