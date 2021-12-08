package com.wts.njp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wts.njp.model.User;
import com.wts.njp.service.UserService;



@RestController
public class ServiceController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/list" , method = RequestMethod.GET)
    public ResponseEntity<List<User>> listUsers() {
        List<User> list = userService.listAllUsers();
        
        return new ResponseEntity<List<User>>(list, HttpStatus.OK);
    }
	
}
