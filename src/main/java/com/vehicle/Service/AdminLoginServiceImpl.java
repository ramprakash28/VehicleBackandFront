package com.vehicle.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicle.pojo.AdminLogin;
import com.vehicle.repository.AdminLoginRepo;

@Service
public class AdminLoginServiceImpl implements AdminLoginService
{
	
	@Autowired
	AdminLoginRepo aRepo;

	@Override
	public AdminLogin loginAdmin(AdminLogin admin) throws Exception {
		String tempEmail= admin.getEmailId();
		String tempPass=admin.getPassword();
		AdminLogin a=null;
		
		if(tempEmail!=null && tempPass!=null)
		{
			a=aRepo.findByEmailIdAndPassword(tempEmail,tempPass);
			if(a==null)
				throw new Exception("Invalid Email Id or password!");
		}
		
		
		return a;
	}

}
