package com.example.camel.service;

import java.util.Optional;

import org.apache.camel.ConsumerTemplate;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.camel.model.User;
import com.example.camel.repo.UserRepository;

@Service
 class SampleResourceImpl implements SampleResource {

	@Autowired
	UserRepository userRepository;
	@Autowired
	ProducerTemplate producerTemplate;
	@Autowired
	ConsumerTemplate consumerTemplate;

	@Override
	public Optional<User> getUser(Long id) {
		Optional<User> user = userRepository.findUserById(id);
		return user;
	}

	@Override
	public String createUser(User user) {
		userRepository.save(user);
		return String.valueOf(user.getId());
	}

	@Override
	public String updateUser(User user) {
		userRepository.save(user);
		return String.valueOf(user.getId());
	}

}
