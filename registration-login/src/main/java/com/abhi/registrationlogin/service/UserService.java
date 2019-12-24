package com.abhi.registrationlogin.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.abhi.registrationlogin.dto.UserRegistrationDto;
import com.abhi.registrationlogin.model.User;

public interface UserService extends UserDetailsService{
	User findByEmail(String email);
	
	User save(UserRegistrationDto registration);
}
