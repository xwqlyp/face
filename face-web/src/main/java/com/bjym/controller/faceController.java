package com.bjym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class faceController {
		
	@RequestMapping(path = "/index.do")
	public String index() {
		return "index";	
	}
	
	
	@RequestMapping(path = "/faceDetect.do")
	public ModelAndView faceDetect() {
		String url = "redirect:http://baidu.com"; 
    	return new ModelAndView(url);

	}
	
}
