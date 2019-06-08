package com.bjym.service.impl;
import java.io.File;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjym.dao.PhotoMapper;
import com.bjym.pojo.Face;
import com.bjym.service.PhotoService;


@Service
public class PhotoServiceImpl implements PhotoService {

	
    @Autowired
    private PhotoMapper photoMapper;
	

	@Override
	public int add(Face face) {
		return photoMapper.insert(face);
	}

	

}
