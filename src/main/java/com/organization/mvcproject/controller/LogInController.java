package com.organization.mvcproject.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller

public class LogInController {
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public String signInPage() {
		return "signup";
	}
}
