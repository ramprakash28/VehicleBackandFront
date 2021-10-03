package com.vehicle.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.pojo.UserLogin;
import com.vehicle.repository.UserLoginRepo;

@Service
public class UserLoginServiceImpl implements UserLoginService{

	@Autowired
	UserLoginRepo uRepo;



	@Override
	public UserLogin saveUser(UserLogin user) throws Exception {

	String tempEmail=user.getUserEmailId();
		
		if(tempEmail !=null && !"".equals(tempEmail)) 
		{
			UserLogin u=uRepo.findByUserEmailId(tempEmail);
			if(u!=null)
				throw new Exception("User exists with this email id "+tempEmail);
		}
		
		
		
		return uRepo.save(user);
	}



	@Override
	public UserLogin loginUser(UserLogin user) throws Exception {
		String tempEmail=user.getUserAddress();
		String tempPassword=user.getUserPassword();
		UserLogin u=null;
		if(tempEmail!=null && tempPassword!=null)
		{
			 u=uRepo.findByUserEmailIdAndUserPassword(tempEmail,tempPassword);
			if(u==null)
				throw new Exception("Invalid EmailId or password");
				
		}
		
		return u;
	}
}
