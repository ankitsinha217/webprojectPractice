package com.springboot.web.service;

import org.springframework.stereotype.Service;
import org.springframework.stereotype.Component;
@Service
public class LoginService {
	
	public boolean validateUser(String userid,String password)
	{
		return userid.equalsIgnoreCase("in")
				&&password.equalsIgnoreCase("dummy");
	}

}
