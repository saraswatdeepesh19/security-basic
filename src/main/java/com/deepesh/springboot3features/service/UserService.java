package com.deepesh.springboot3features.service;

import com.deepesh.springboot3features.dto.UserRequest;
import com.deepesh.springboot3features.entity.UserEntity;
import com.deepesh.springboot3features.repository.UserEntityRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    private final UserEntityRepository userRepository;
    private  final PasswordEncoder passwordEncoder;

	public UserService(UserEntityRepository userRepository, PasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
	}


	public UserEntity addUser(UserRequest request) {
        UserEntity user = new UserEntity();
        user.setUserID(request.getPsid());
        user.setUserName(request.getUserName());
        user.setUserEmail(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword())); // 🔑 store encoded
        user.setRole(request.getRole());
        user.setStatus(true);
		user.setGbgf(request.getGbgf());
		user.setProjectName(request.getProjectName());

        return userRepository.save(user);
    }
}