//package com.wts.njp.controller;
//
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.MessageSource;
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
//@RestController
//public class UserController {
//	
//	@Autowired
//	UserService userService;
//	
//    // List users 
//    @RequestMapping(value = "/list" , method = RequestMethod.GET)
//    public ModelAndView list() {
//    	
//    	ModelAndView model = new ModelAndView("users/allusers");
//        List<User> list = userService.listAllUsers();
//        
//        model.addObject("list", list);
//        
//        return model;
//    }
//}