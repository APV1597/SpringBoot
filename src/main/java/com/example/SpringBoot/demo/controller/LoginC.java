package com.example.SpringBoot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.SpringBoot.demo.loginservice.LoginService;

@Controller
public class LoginC {
	@Autowired
	LoginService service;
@RequestMapping(value="/login",method=RequestMethod.GET)
public String print()
{
	return "login";
}

@RequestMapping(value="/login",method=RequestMethod.POST)
public String showMessage(ModelMap model, @RequestParam String name,@RequestParam String password )
{
	
	boolean valid= service.validator(name, password);
	if(!valid)
	{
		model.put("errorMessage","Invalid credentials");
		return "login";
	}
	model.put("name", name);
	model.put("password", password);
	return "welcome";
}
	
	
	
	
}
