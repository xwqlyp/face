package com.bjym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class login {

	
	@RequestMapping(value = "/login")
	public String userLogin() {
		
		System.out.println("21313SW");
		return "views/index";
	}
	
}
