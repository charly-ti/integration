package com.example.camel.service;

import java.util.Optional;

import com.example.camel.model.User;

public interface SampleResource {

	public Optional<User> getUser(Long id);

	public String createUser(User user);

	public String updateUser(User user);

}
