package com.mydream.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mydream.springmvc.entity.Users;
import com.mydream.springmvc.service.UsersService;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	// need to inject our User service
	@Autowired
	private UsersService usersService;
	
	@RequestMapping("/index")
	public String indexPage(Model theModel){
		
		return "home-page";
	}
	@RequestMapping("/users")
	public String listUser(Model theModel){
		
		// get users from the service
		List<Users> theUsers = usersService.getUsers();
		
		// add the customers to the model
		theModel.addAttribute("users", theUsers);
		System.out.println("HI");
		
		return "list_users";
	}

}
