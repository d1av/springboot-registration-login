package com.security.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.security.springboot.service.UserService;
import com.security.springboot.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

	private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}
	
	@GetMapping							//(Model model)
	public String showRegistrationForm() {
		//model.addAttribute("user", new UserRegistrationDto());
		return "registration.html";
	}
	
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user")UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		return "redirect:/registration?success";
	}
	
	
}
