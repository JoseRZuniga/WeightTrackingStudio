package com.wts.njp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.wts.njp.model.User;
import com.wts.njp.service.UserService;


@RequestMapping(value ="/user")
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/getAll")
	public ResponseEntity<List<User>> fetchAllUsers(){
		return new ResponseEntity<List<User>>(userService.retrieveAllUsers(), HttpStatus.OK);
	}
	
	@PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> createUser(@RequestBody User user) {
		userService.saveUser(user);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@PutMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> updateUser(@RequestBody User user) {
		userService.saveUser(user);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
