//package com.wts.njp.controller;
//
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.MessageSource;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.wts.njp.model.User;
//import com.wts.njp.service.UserService;
//
//
//@RequestMapping(value ="/users")
//@Controller
//public class UserController {
//	
//	@Autowired
//	UserService userService;
//	
//	// List users 
//    @RequestMapping(value = "/allusers" , method = RequestMethod.GET)
//    public ModelAndView list() {
//    	
//        List<User> list = userService.listAllUsers();
//        
//        return new ModelAndView("allusers", "list", list);
//    }
//    
//    @RequestMapping(value = "/registration", method = RequestMethod.GET)
//    public ModelAndView add() {
//    	return new ModelAndView("registration", "command", new User());
//    }
//    
//    @RequestMapping(value = "/registration", method = RequestMethod.POST)
//    public ModelAndView save(User user) {
//    	return new ModelAndView("success", "saveEmployee", user);
//    }
//    
//    
//}