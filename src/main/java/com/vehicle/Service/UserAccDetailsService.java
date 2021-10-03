package com.vehicle.Service;

import com.vehicle.pojo.UserAccDetails;
public interface UserAccDetailsService {
	
	UserAccDetails saveUser(UserAccDetails user) throws Exception;
	UserAccDetails getUser(String AccNo);
	
}
