package com.swrookie.onboard.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.swrookie.onboard.common.UserRole;
import com.swrookie.onboard.domain.UserEntity;
import com.swrookie.onboard.dto.UserDto;
import com.swrookie.onboard.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService implements UserDetailsService{
	private UserRepository userRepository;
	
	/**
	 * Encrypt raw password string to encrypted password using BCryptPasswordEncoder
	 * Register new user into database using userRepository and check if transaction is successful by id return
	 * @param userDto
	 * @return id
	 */
	
	@Transactional
	public Long registerUser(UserDto userDto) {
		BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();
		userDto.setPassword(bcryptPasswordEncoder.encode(userDto.getPassword()));
		
		return userRepository.save(userDto.toEntity()).getId();
	}
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		UserEntity user = userRepository.findByEmail(email).get();
		List<GrantedAuthority> authorities = new ArrayList<>();
		
		if (email.equals("admin@onboard.com")) {
			authorities.add(new SimpleGrantedAuthority(UserRole.ADMIN.getValue()));
		}
		else {
			authorities.add(new SimpleGrantedAuthority(UserRole.MEMBER.getValue()));
		}
		
		return new User(user.getEmail(), user.getPassword(), authorities);
	}
}
