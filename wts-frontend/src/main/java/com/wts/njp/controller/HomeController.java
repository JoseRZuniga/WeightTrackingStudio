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
	
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public ModelAndView user() {
		return new ModelAndView("signup", "command", new User());
	}
	
	@RequestMapping(value="/addUser")
	public ModelAndView addUser(User user) {
		return new ModelAndView("userDisplay", "submittedUser", user);
	}
	
}
