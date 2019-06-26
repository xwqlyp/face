package com.bjym.service.impl;
import java.io.File;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjym.dao.PhotoMapper;
import com.bjym.pojo.Face;
import com.bjym.pojo.DetectFace_List;
import com.bjym.service.PhotoService;


@Service
public class PhotoServiceImpl implements PhotoService {

	
    @Autowired
    private PhotoMapper photoMapper;
	

	@Override
	public void add(Face face) {
		 photoMapper.insert(face);
	}

	

	@Override
	public int addFace(Face face) {
		int a=photoMapper.saveFace(face);
		int b=photoMapper.saveFace_List(face.getFace_list());
		if (a==1 && b==1) {
			return 0;
		} else {
			return 1;
		}
		
	}
	
	@Override
	public int addFace_list(DetectFace_List face) {
		int b=photoMapper.saveFace_List(face);
		System.err.println(face);
		
		return b;
	}
	

}
