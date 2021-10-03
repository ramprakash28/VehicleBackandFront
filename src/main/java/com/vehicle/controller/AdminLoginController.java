package com.vehicle.controller;

import javax.persistence.*;
//import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vehicle.Service.AdminLoginService;
import com.vehicle.pojo.AdminLogin;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AdminLoginController
{
	@Autowired
	AdminLoginService aService;
	
//	ONLY ONE ADMIN WILL BE ALLOWED HAVING "admin@gmail.com" AS EMAIL ID AND "admin" AS PASSWORD.
//	select * from admin_login_details;
//  
//	insert into admin_login_details values('1','admin@gmail.com','admin');
//	
//	
	
	
	@PostMapping("/adminLogin")

	public AdminLogin loginAdmin(@RequestBody AdminLogin admin) throws Exception
	{
		return aService.loginAdmin(admin);
	}
}
