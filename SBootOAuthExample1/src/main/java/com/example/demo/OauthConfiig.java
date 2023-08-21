package com.example.demo;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import jakarta.servlet.Filter;
import jakarta.servlet.http.HttpServletRequest;
@Configuration
public class OauthConfiig {
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception{

		return http.authorizeHttpRequests(auth ->{
			auth.requestMatchers("/")
			.permitAll();
			auth.anyRequest()
			.authenticated();
			
		}).oauth2Login(Customizer.withDefaults())
				.formLogin(Customizer.withDefaults())
				.build();
		
	}
		
}
