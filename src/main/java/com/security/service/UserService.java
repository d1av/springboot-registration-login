package com.security.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.security.model.User;
import com.security.web.dto.UserRegistrationDto;

@Service
public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}