package com.deepesh.springboot3features.controller;

import com.deepesh.springboot3features.dto.UserRequest;
import com.deepesh.springboot3features.entity.UserEntity;
import com.deepesh.springboot3features.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class Controller {

	private final UserService userService;

	public Controller(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/public")
	public String hello() {
		return "Hello World!";
	}

	@GetMapping("/admin")
	public String user() {
		return "Hello USER!";
	}


	@GetMapping("/user")
	public String admin() {
		return "Hello ADMIN!";
	}




	// POST /api/users
	@PostMapping("/public/users")
	public ResponseEntity<UserEntity> addUser(@RequestBody UserRequest request) {
		UserEntity savedUser = userService.addUser(request);

		System.out.println("Saved User: " + request);
		return ResponseEntity.ok(savedUser);
	}
}
