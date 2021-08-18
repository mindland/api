package com.myclass.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myclass.entity.User;
import com.myclass.service.impl.UserServiceImpl;

@RestController
@RequestMapping("api/auth")
public class ApiAuthController  {
	
	@Autowired
	private UserServiceImpl UserServiceImpl;
	
	@PostMapping(value = "")
	public Object login(String email, String password) {
		try {
			User user = (User) UserServiceImpl.login(email, password);
			return new ResponseEntity<Object>(user,HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Object>("wrong email or password",HttpStatus.BAD_REQUEST);
		}
	}
	
	
}
