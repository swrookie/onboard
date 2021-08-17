package com.swrookie.onboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.swrookie.onboard.dto.UserDto;
import com.swrookie.onboard.service.UserService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class UserController {
	private UserService userService;
	
	@GetMapping("/user/login")
	public String login() {
		return "user/login";
	}
	
	@GetMapping("/user/register")
	public String register() {
		return "user/register";
	}
	
	@PostMapping
	public String register(UserDto userDto) {
		userService.registerUser(userDto);
		
		return "redirect:/user/login";
	}
	
	@GetMapping("/user/denied")
	public String denied() {
		return "user/denied";
	}
}
