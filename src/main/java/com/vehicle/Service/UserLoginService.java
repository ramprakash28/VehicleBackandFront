package com.vehicle.Service;

import com.vehicle.pojo.UserLogin;

public interface UserLoginService {



	UserLogin saveUser(UserLogin user) throws Exception;

	UserLogin loginUser(UserLogin user) throws Exception;

}
