package com.swrookie.onboard.config;

import org.springframework.context.annotation.Configuration;

import com.swrookie.onboard.service.UserService;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class SecurityConfig {
	private UserService userService;
	
//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder
//	}
}
