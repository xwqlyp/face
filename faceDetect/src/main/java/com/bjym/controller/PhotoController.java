package com.bjym.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.baidu.ai.utils.ImageUtils;

import com.bjym.pojo.DetectFace_List;
import com.bjym.pojo.Face;
import com.bjym.service.PhotoService;
import com.bjym.utils.Detect;

@Controller
public class PhotoController {
	
	
	@Autowired
	private PhotoService photoService;
	
	@RequestMapping(path = "/upload.do")
	@ResponseBody
	public Map upLoad(MultipartFile file,HttpServletResponse response,HttpServletRequest request) {

		String imgName = request.getParameter("imgName");	
		int type=Integer.parseInt(request.getParameter("face_type"));
		System.out.println(imgName+"222222222222222222222222222");
		System.err.println(imgName);
		String imgPath = null;
		Face face=new Face();
		Map map = new HashMap();
		Map result= new HashMap();
		Integer code = null;
		
		String msg = null;
		try {
			imgPath = ImageUtils.upload(request, file);
			if(imgName == null || imgName.length() <= 0) {
				String fileName=file.getOriginalFilename();
				imgName=fileName.substring(0, fileName.indexOf("."));
			}
			if (imgPath != null) {
				face=Detect.detectFace(imgPath, "1");
				face.setPhotoImg(imgPath);
				face.setPhotoName(imgName);
				face.setType(type);
				DetectFace_List face_list=face.getFace_list();
				int resultCode=photoService.addFace(face);
				if (resultCode!=0) {
					code=1;
					msg="保存图片出错";
				}
				code=0;
			}else{
                System.out.println("-----------------图片上传失败！");
            }
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			msg="保存成功";
			map.put("code", code);
			map.put("msg", msg);
			map.put("data", result);
			result.put("src",imgPath);
			return map;	
		}	
	}
}
