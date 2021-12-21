package com.wts.njp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wts.njp.model.UserView;


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
	
	@RequestMapping(value= "/dashboard")
	public ModelAndView dashboard() {
		return new ModelAndView("dashboard");
	}
	@RequestMapping(value= "/logger")
	public ModelAndView logger() {
		return new ModelAndView("logger");
	}
	@RequestMapping(value= "/allusers")
	public ModelAndView allusers() {
		return new ModelAndView("allusers");
	}
	@RequestMapping(value= "/updateForm")
	public ModelAndView updateForm() {
		return new ModelAndView("updateForm");
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public ModelAndView user() {
		return new ModelAndView("signup", "command", new UserView());
	}
	
	@RequestMapping(value="/addUser")
	public ModelAndView addUser(UserView user) {
		return new ModelAndView("userDisplay", "submittedUser", user);
	}
	
}
