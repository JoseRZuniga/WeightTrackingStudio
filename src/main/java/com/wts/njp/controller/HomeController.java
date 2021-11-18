package com.wts.njp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.wts.njp.model.User;
import com.wts.njp.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	UserService userService;
	
	// List users 
    @RequestMapping(value = "/list" , method = RequestMethod.GET)
    public ModelAndView list() {
    	
    	ModelAndView model = new ModelAndView("allusers");
        List<User> list = userService.listAllUsers();
        
        model.addObject("list", list);
        
        return model;
    }
    
    @RequestMapping(value = "/update-{id}", method = RequestMethod.GET)
    public ModelAndView updateUser(@PathVariable("id") Integer id) {
    	ModelAndView model = new ModelAndView("registration");
    	User user = userService.findUserById(id);
    	
    	model.addObject("userForm", user);
    	
    	return model;
    }
    
    @RequestMapping(value = "/delete-{id}", method = RequestMethod.GET)
    public ModelAndView deleteUser(@PathVariable("id") Integer id) {
    	userService.deleteUser(id);
    	
    	return new ModelAndView("redirect:/list");
    }
    
    
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addUser() {
    	ModelAndView model = new ModelAndView("registration");
    	User user = new User();
    	
    	model.addObject("userForm", user);
    	
    	return model;
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView saveUser (@ModelAttribute ("userForm") User user) {
    	
    	userService.saveOrUpdate(user);
    	
    	return new ModelAndView("redirect:/list");
    }
	
	@RequestMapping(value= "/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/services")
	public ModelAndView services() {
		return new ModelAndView("services");
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView contact() {
		return new ModelAndView("contact");
	}
	
	@RequestMapping(value="/login")
	public ModelAndView loginPage() {
		return new ModelAndView("login");
	}
	
	@RequestMapping(value= "/dashboard")
	public ModelAndView dashboard() {
		return new ModelAndView("dashboard");
	}
	
	// Creating a user
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public ModelAndView user() {
		return new ModelAndView("signup", "command", new User());
	}
	
	@RequestMapping(value="/addUser")
	public ModelAndView addUser(User user) {
		return new ModelAndView("userDisplay", "submittedUser", user);
	}
	
	
//	// For adding weight
//	@RequestMapping(value= "/addWeight")
//	public ModelAndView addWeight(Log weight, ModelMap model) {
//		return new ModelAndView("logging", "submittedWeight", weight);
//	}
	
}
