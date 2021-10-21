package com.wts.njp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.wts.njp.model.User;
import com.wts.njp.model.WeightTracking;

@Controller
public class HomeController {
	
	@RequestMapping(value= "/")
	public ModelAndView home() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/services", method = RequestMethod.GET)
	public ModelAndView services() {
		return new ModelAndView("services");
	}
	
	@RequestMapping(value="/contact", method = RequestMethod.GET)
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
	@RequestMapping(value="/signup", method = RequestMethod.GET)
	public ModelAndView user() {
		return new ModelAndView("signup", "command", new User());
	}

	
	// For adding weight
	@RequestMapping(value= "/addWeight")
	public ModelAndView addWeight(WeightTracking weight, ModelMap model) {
		return new ModelAndView("logging", "submittedWeight", weight);
	}
	
}
