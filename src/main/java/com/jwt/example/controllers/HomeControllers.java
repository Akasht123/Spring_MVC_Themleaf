package com.jwt.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.example.entity.User;
import com.jwt.example.services.UserService;

@RestController
@RequestMapping("/home")
public class HomeControllers {
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/users")
	public List<User> getUser() {
		System.out.println("getting users");
		return this.userService.getUser();
	}
	
	

}
