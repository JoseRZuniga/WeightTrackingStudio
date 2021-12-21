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
import org.springframework.web.util.UriComponentsBuilder;

import com.wts.njp.manager.UserManager;
import com.wts.njp.model.UserView;

@RestController
public class UserController {
	
	@Autowired
	private UserManager userManager;
	
    @RequestMapping(value = "/user/" , method = RequestMethod.GET)
    public ResponseEntity<List<UserView>> listUsers() {
        List<UserView> users = userManager.listAllUsers();
        
        if(users.isEmpty()){
            return new ResponseEntity<List<UserView>>(HttpStatus.NOT_FOUND);
        }
        
        return new ResponseEntity<List<UserView>>(users, HttpStatus.OK);
    }
	
    
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserView> getUser(@PathVariable("id") Long id) {
    	System.out.println("Fetching User with id " + id);
        UserView user = userManager.findUserById(id);
        if (user == null) {
            System.out.println("User with id " + id + " not found");
            return new ResponseEntity<UserView>(HttpStatus.NOT_FOUND);
        }
        
        return new ResponseEntity<UserView>(user, HttpStatus.OK);
    }
	
    @RequestMapping(value = "/user/", method = RequestMethod.POST)
    public ResponseEntity<Void> createUser(@RequestBody UserView user,    UriComponentsBuilder ucBuilder) {
    	System.out.println("Creating User " + user.getName());
    	
    	userManager.saveUser(user);
  
    	HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
  
    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public ResponseEntity<UserView> updateUser(@PathVariable("id") Long id, @RequestBody UserView user) {
        UserView currentUser = userManager.findUserById(id);
 
        currentUser.setName(user.getName());
        currentUser.setAge(user.getAge());
        currentUser.setEmail(user.getEmail());
          
        userManager.updateUser(currentUser);
        
        return new ResponseEntity<UserView>(currentUser, HttpStatus.OK);
    }
	
	
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<UserView> deleteUser(@PathVariable("id") Long id) {
        UserView user = userManager.findUserById(id);
        userManager.deleteUser(id);
        
        return new ResponseEntity<UserView>(HttpStatus.NO_CONTENT);
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Autowired
//	UserService userService;
//	
//
//    @RequestMapping(value = "/list" , method = RequestMethod.GET)
//    public ModelAndView listUsers() {
//    	
//    	ModelAndView model = new ModelAndView("allusers");
//        List<User> list = userService.listAllUsers();
//        
//        model.addObject("list", list);
//        
//        return model;
//    }
//    
//    
//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public ModelAndView addUser() {
//    	ModelAndView model = new ModelAndView("registration");
//    	User user = new User();
//    	
//    	model.addObject("userForm", user);
//    	
//    	return model;
//    }
//    
//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public ModelAndView saveUser (@ModelAttribute ("userForm") User user) {
//    	ModelAndView model = new ModelAndView("success");
//    	userService.saveOrUpdate(user);
//    	
//    	model.addObject("success",  user.getName() + " was added successfully.");
//    	
//    	return model;
//    }
//    
//    @RequestMapping(value = "/update", method = RequestMethod.POST)
//    public ModelAndView update (@ModelAttribute ("userForm") User user) {
//    	userService.saveOrUpdate(user);
//    	
//    	return new ModelAndView("redirect:/list");
//    }
//    
//    
//    @RequestMapping(value = "/update-{id}", method = RequestMethod.GET)
//    public ModelAndView updateUser(@PathVariable("id") Integer id) {
//    	ModelAndView model = new ModelAndView("updateForm");
//    	User user = userService.findUserById(id);
//    	
//    	model.addObject("userForm", user);
//    	
//    	return model;
//    }
//    
//    @RequestMapping(value = "/delete-{id}", method = RequestMethod.GET)
//    public ModelAndView deleteUser(@PathVariable("id") Integer id) {
//    	userService.deleteUser(id);
//    	
//    	return new ModelAndView("redirect:/list");
//    }
//    
//    
//    
    
}