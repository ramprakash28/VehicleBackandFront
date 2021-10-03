package com.vehicle.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.pojo.UserAccDetails;
import com.vehicle.repository.UserAccDetailsRepo;

@Service
public class UserAccDetailsServiceImpl implements UserAccDetailsService {
	@Autowired
	UserAccDetailsRepo uRepo ;
	
	@Override
	public UserAccDetails saveUser(UserAccDetails user) throws Exception {
		String tempAccNo= user.getAccNo();
		UserAccDetails u=null;
		
		if(tempAccNo!=null)
		{
			u=uRepo.findByAccNo(tempAccNo);
			if(u!=null)
				throw new Exception("Invalid User");
		}
		return uRepo.save(user);
	}
	
	@Override
	public UserAccDetails getUser(String AccNo) {
		return uRepo.findByAccNo(AccNo);
	}


}
