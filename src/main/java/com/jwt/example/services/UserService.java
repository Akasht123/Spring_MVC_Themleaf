package com.jwt.example.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.jwt.example.entity.User;

@Service
public class UserService {
	private List<User> store = new ArrayList<>();
	
	public UserService() {
		store.add( new User (UUID.randomUUID().toString(),"Sarvesh","sarvesh@t"));
		store.add( new User (UUID.randomUUID().toString(),"Akash Tathe","akash@t"));
		store.add( new User (UUID.randomUUID().toString(),"Umesh Tathe","umesh@t"));
		store.add( new User (UUID.randomUUID().toString(),"Amar Tathe","amar@t"));
		
	}
	 
	public List<User> getUser(){
		
		return this.store;
	}
	
	

}
