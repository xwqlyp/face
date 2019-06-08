package com.bjym.controller;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.baidu.ai.aip.utils.GsonUtils;
import com.bjym.common.ImageUtils;
import com.bjym.pojo.Face;
import com.bjym.pojo.User;
import com.bjym.service.PhotoService;


@Controller
public class PhotoController {
	
	
	@Autowired
	private PhotoService photoService;

	@RequestMapping(path = "/addFace.do", method = RequestMethod.POST)
	public String addUser(Face face, HttpServletRequest request, MultipartFile pictureFile) {
		String imgName;
		String imgPath;
		try {
			imgPath = ImageUtils.upload(request, pictureFile);
			imgName=request.getParameter("photoName");
			if (imgPath != null && imgName != null) {
				face.setPhotoImg(imgPath);
				face.setPhotoName(imgName);
			}else{
                System.out.println("-----------------图片上传失败！");
            }
		} catch (IOException e) {
			e.printStackTrace();
			}
		//将数据提交到数据库（包含文件和普通表单数据）
		int rowNo = photoService.add(face);
		if (rowNo > 0) {
			
			return "addUser";
		} else {
			System.out.println("----------------------用户添加失败！");
			return "addUser";
		}
	}
	
	@RequestMapping(path = "/upload.do")
	@ResponseBody
	public Map upLoad(MultipartFile file,HttpServletResponse response) {
		Map map = new HashMap();
		Map result= new HashMap();
		result.put("src","http://cdn.layui.com/123.jpg");
		map.put("code", new Integer(0));
		map.put("msg", "cg");
		map.put("data", result);

		JSONObject json=new JSONObject(map);

		return map;
	}

	
	
	@RequestMapping(path = "/index.do")
	public String index() {
		System.err.println("---ewqqrwqrweq ----");
		return "index";
		
	}
	
	@RequestMapping(path = "/faceDetect.do")
	public String faceDetect() {
		System.err.println("---------------------------------------");
		return "faceDetect";
		
	}
	
}
