package com.wts.njp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.wts.njp.manager.UserManager;
import com.wts.njp.model.UserView;

@RequestMapping(value ="/user")
@RestController
public class UserController {
	
	@Autowired
	private UserManager userManager;
	
    @RequestMapping(value = "/list" , method = RequestMethod.GET)
    public ResponseEntity<List<UserView>> listUsers() {
        List<UserView> list = userManager.listAllUsers();
        
        if(list.isEmpty()){
            return new ResponseEntity<List<UserView>>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<List<UserView>>(list, HttpStatus.OK);
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