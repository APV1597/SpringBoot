package com.example.SpringBoot.demo.loginservice;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
	
	public boolean validator(String name, String password)
	{
		return name.equalsIgnoreCase("in28mins")&& password.equalsIgnoreCase("password");
	}
	

}
