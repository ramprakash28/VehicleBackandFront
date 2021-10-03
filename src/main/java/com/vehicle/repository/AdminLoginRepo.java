package com.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicle.pojo.AdminLogin;

@Repository
public interface AdminLoginRepo extends JpaRepository<AdminLogin, Integer>{

	

	AdminLogin findByEmailIdAndPassword(String tempEmail, String tempPass);
	
	

}
