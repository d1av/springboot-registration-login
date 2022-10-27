package com.security.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.security.springboot.model.User;
import com.security.springboot.web.dto.UserRegistrationDto;

@Service
public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}