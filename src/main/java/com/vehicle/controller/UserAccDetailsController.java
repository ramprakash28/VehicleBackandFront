package com.vehicle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.Service.UserAccDetailsService;
import com.vehicle.pojo.UserAccDetails;
//import com.vehicle.repository.UserAccDetailsRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserAccDetailsController {
	
	@Autowired
	UserAccDetailsService uService;
	
	
	@PostMapping("/userAccDetails")

	public UserAccDetails saveUser(@RequestBody UserAccDetails user) throws Exception
	{
		System.out.println(user+"...........user");
		return uService.saveUser(user);
	}
	
	@GetMapping("/userAccDetails/{AccNo}")
	public UserAccDetails getUser(@PathVariable String AccNo) {
		System.out.println(AccNo+"..........get");
		return uService.getUser(AccNo);
	}
}
