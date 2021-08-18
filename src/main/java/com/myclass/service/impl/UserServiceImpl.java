package com.myclass.service.impl;


import org.springframework.stereotype.Service;

import com.myclass.entity.User;
import com.myclass.repository.UserRepository;
import com.myclass.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	public UserServiceImpl() {
		userRepository = new UserRepository();
	}
	
	@Override
	public User login(String email, String password) {
		return userRepository.login(email, password); 
	}

}
