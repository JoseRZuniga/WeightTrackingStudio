package com.wts.njp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.UriComponentsBuilder;

import com.wts.njp.model.User;
import com.wts.njp.service.UserService;



@RestController
public class ServiceController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/user" , method = RequestMethod.GET)
    public ResponseEntity<List<User>> listUsers() {
        List<User> users = userService.listAllUsers();
        
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUser(@PathVariable("id") Long id) {
        User user = userService.findUserById(id);
        
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
	
	@RequestMapping(value = "/user/", method = RequestMethod.POST)
    public ResponseEntity<Void> createUser(@RequestBody User user, UriComponentsBuilder ucBuilder) {
    	userService.save(user);

    	HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
  
    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public ResponseEntity<User> updateUser(@PathVariable("id") Long id, @RequestBody User user) {
        User currentUser = userService.findUserById(id);
        
        currentUser.setName(user.getName());
        currentUser.setAge(user.getAge());
        currentUser.setEmail(user.getEmail());
        
        userService.update(currentUser);
        
        return new ResponseEntity<User>(currentUser, HttpStatus.OK);
    }
	
	
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<User> deleteUser(@PathVariable("id") Long id) {
        User user = userService.findUserById(id);
        userService.deleteUser(id);
        
        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
    }
	
    @RequestMapping(value= "/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}
}
