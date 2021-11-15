package com.wts.njp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wts.njp.model.User;
import com.wts.njp.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	UserService userService;
	
	// List users 
    @RequestMapping(value = "/allusers" , method = RequestMethod.GET)
    public ModelAndView list() {
    	
        List<User> list = userService.listAllUsers();
        
        return new ModelAndView("allusers", "list", list);
    }
    
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public ModelAndView add() {
    	return new ModelAndView("registration", "command", new User());
    }
    
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView save(User user) {
    	return new ModelAndView("success", "saveEmployee", user);
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
