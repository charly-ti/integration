package com.example.camel.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.camel.model.User;
import com.example.camel.service.SampleResource;

@RestController
public class SampleController {

	@Autowired
	private SampleResource service;

	@GetMapping(value = "/users")
	public User getUsers(@RequestParam("userId") Long userId) {
		Optional<User> user = service.getUser(userId);
		return user.get();
	}

	@PostMapping(value = "/users")
	public String addUsers(@RequestBody User user) {
		service.createUser(user);
		return "Success";
		

	}

	@PutMapping(value = "/users")
	public String modifyUsers(@RequestBody User user) {
		service.updateUser(user);
		return "Success";

	}

}
