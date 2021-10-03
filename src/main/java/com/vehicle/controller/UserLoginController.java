package com.vehicle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.Service.UserLoginService;
import com.vehicle.pojo.UserLogin;
import com.vehicle.repository.UserLoginRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserLoginController {
	
	@Autowired
	UserLoginService uService;
	
	@PostMapping("/userRegister")
	
	public UserLogin registerUser(@RequestBody UserLogin user) throws Exception 
	{
		return uService.saveUser(user);
	}
	
	
	@PostMapping("/userLogin")

	public UserLogin loginUser(@RequestBody UserLogin user) throws Exception
	{
		return uService.loginUser(user);
	}
	
	


}
