package com.security.repository;

import com.security.model.User;

import com.security.web.dto.UserRegistrationDto;

public interface UserService {
	User save(UserRegistrationDto registrationDto);
}
