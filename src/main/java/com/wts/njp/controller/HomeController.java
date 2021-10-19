package com.wts.njp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wts.njp.model.WeightTracking;
import com.wts.njp.model.User;

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
	
	
	// Creating a user
	@RequestMapping(value="/signup", method = RequestMethod.GET)
	public ModelAndView user() {
		return new ModelAndView("signup", "command", new User());
	}
	
	// Creating a new tracking
	@RequestMapping(value= "/dashboard")
	public ModelAndView dashboard() {
		return new ModelAndView("dashboard", "command", new WeightTracking());
	}
	
	
	// For adding weight
	@RequestMapping(value= "/addWeight")
	public ModelAndView addWeight(WeightTracking weight, ModelMap model) {
		if(weight.getDate().equals("")) {
			weight.setDate("Not Available");
		}
		return new ModelAndView("logging", "submittedWeight", weight);
	}
	
	
}
