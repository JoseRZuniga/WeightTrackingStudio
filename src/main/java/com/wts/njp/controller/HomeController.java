package com.wts.njp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wts.njp.model.User;

@Controller
public class HomeController {
	
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
	@GetMapping(value="/signup")
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
