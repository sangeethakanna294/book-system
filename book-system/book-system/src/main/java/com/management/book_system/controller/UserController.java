package com.management.book_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.book_system.entity.Account;
import com.management.book_system.service.UserService;



@RestController
@RequestMapping("/api/users")
public class UserController {
	@Autowired
	private UserService userService;
	
//	@GetMapping("/ALL")
//	public List<Account>getUsersList(){
//		List<Account> usersList=userService.getUsersList();
//		return usersList;
//	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	
	@GetMapping("/usersList")
	public List <Account>getUsersList(){
		List<Account> usersList= userService.getUsersList();
		return usersList;
		
	}
}
