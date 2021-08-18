package com.myclass.service;

import com.myclass.entity.User;

public interface UserService {
	User login(String email, String password); 
}
