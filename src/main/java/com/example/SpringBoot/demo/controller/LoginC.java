package com.example.SpringBoot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginC {
@RequestMapping("/login")
public String print()
{
	return "login";
}
	
	
	
	
	
}
