package com.bjym.dao;

import com.bjym.pojo.Face;
import com.bjym.pojo.DetectFace_List;

public interface PhotoMapper {
	
	int saveFace_List(DetectFace_List face_list);
	
	int saveFace(Face face);
	
	void insert(Face face);

	
}
