package com.bjym.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FaceDetectController {
		
	@RequestMapping(path = "/index.do")
	public String index() {
		return "index";	
	}
	
	@RequestMapping(path = "/faceDetect.do")
	public String faceDetect() {
		return "faceDetect";
		
	}
	
	@RequestMapping(path = "/table.do")
	public String table() {
		return "tab";
	}
	
	@RequestMapping(path = "/content.do")
	public String content() {
		return "show";
	}
	
}
