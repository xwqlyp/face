package com.bjym.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bjym.service.PhotoService;


@Controller
public class FaceDetectAjax {
	
	
	
	@Autowired
	private PhotoService photoService;
	
	
	
//	@RequestMapping(path = "/tab.do")
//	@ResponseBody
//	public Map tab(HttpServletResponse response,HttpServletRequest request) {
//		String path=request.getParameter("img");
//		Map map=LaYuiUtil.getResultTable(path);
//		return map;
//	}
	
	
}
