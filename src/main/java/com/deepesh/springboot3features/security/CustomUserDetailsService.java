package com.deepesh.springboot3features.security;

import com.deepesh.springboot3features.repository.UserEntityRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	private final UserEntityRepository userEntityRepository;

	public CustomUserDetailsService(UserEntityRepository userEntityRepository) {
		this.userEntityRepository = userEntityRepository;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userEntityRepository.findById(username)
				.map(CustomUserDetails::new)
				.orElseThrow(() -> new UsernameNotFoundException("User not found with ID: " + username));
	}

}
