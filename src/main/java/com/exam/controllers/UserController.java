package com.exam.controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.models.Role;
import com.exam.models.User;
import com.exam.models.UserRoleAssign;
import com.exam.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
@GetMapping("/save")
 public String saveUser(){
	
 User user=new User("harendra","kumar","harryBhai123","9319506626","email123@com","pass","default.png", true);
	
	
	Set<UserRoleAssign> roleSet=new HashSet<>();

	userService.save(user, roleSet);
	
	
return "saved";
}
}
