package com.simplesolutions.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplesolutions.models.User;
import com.simplesolutions.repo.UsersRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UsersRepository usersRepository;
	
	@PostMapping("/")
	public ResponseEntity<User> addUser(@RequestBody User user){
		return new ResponseEntity<User>(usersRepository.save(user), HttpStatus.CREATED);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<User>> getUsers(){
		return new ResponseEntity<List<User>>(usersRepository.findAll(), HttpStatus.OK);
	}

}
