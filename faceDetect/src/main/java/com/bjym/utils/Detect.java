package com.bjym.utils;

import java.io.IOException;

import org.json.JSONObject;

import com.baidu.ai.utils.FileUtil;
import com.baidu.api.FaceDetect;
import com.bjym.pojo.DetectFace_List;
import com.bjym.pojo.Face;

public class Detect {
	public static Face detectFace(String img, String max_face_num){
		Face face=new Face();
		DetectFace_List face_list = null;
		try {
			face_list=detectFace_List(FileUtil.readFileByBytes(img), "1");
			if(face_list!=null) {
				Long id=face_list.getId();
				face.setFace_list(face_list);
				face.setId(id);
			}else {
				face_list=detectFace_List(FileUtil.readFileByBytes(img), "1");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return face;
	}
	

	
	public static DetectFace_List detectFace_List(byte[] arg0, String max_face_num) throws IOException {
		DetectFace_List f1=null;
		String face_list=null;
		String resultJson=FaceDetect.detect(arg0, max_face_num);
		JSONObject jsonData = new JSONObject(resultJson);
		int error_code=jsonData.getInt("error_code");
		Long id=jsonData.getLong("log_id");
		if (error_code == 0 ) {
			JSONObject result=jsonData.getJSONObject("result");
			face_list=result.getJSONArray("face_list").toString().replace("[", "").replace("]", "");
			JSONObject json=new JSONObject(face_list);	
			String face_token = json.getString("face_token");
			double beauty =json.getDouble("beauty");
			int age =json.getInt("age");
			double emotion_probability =json.getJSONObject("emotion").getDouble("probability");
			String emotion_type = json.getJSONObject("emotion").getString("type");
			double race_probability =json.getJSONObject("race").getDouble("probability");
			String race_type = json.getJSONObject("race").getString("type");
			double expression_probability =json.getJSONObject("expression").getDouble("probability");
			String expression_type = json.getJSONObject("expression").getString("type");
			double face_shape_probability=json.getJSONObject("face_shape").getDouble("probability");
			String face_shape_type = json.getJSONObject("face_shape").getString("type");
			double face_type_probability=json.getJSONObject("face_type").getDouble("probability");
			String face_type_type= json.getJSONObject("face_type").getString("type");
			double gender_probability=json.getJSONObject("gender").getDouble("probability");
			String gender_type = json.getJSONObject("gender").getString("type");
			double glasses_probability=json.getJSONObject("glasses").getDouble("probability");
			String glasses_type = json.getJSONObject("glasses").getString("type");
			double location_left = json.getJSONObject("location").getDouble("left");
			double location_top = json.getJSONObject("location").getDouble("top");
			double location_width = json.getJSONObject("location").getDouble("width");
			double location_height = json.getJSONObject("location").getDouble("height");
			double location_rotation = json.getJSONObject("location").getDouble("rotation");
			
			double occlusion_right_eye = json.getJSONObject("quality").getJSONObject("occlusion").getDouble("right_eye");
			double occlusion_nose = json.getJSONObject("quality").getJSONObject("occlusion").getDouble("nose");
			double occlusion_mouth = json.getJSONObject("quality").getJSONObject("occlusion").getDouble("mouth");
			double occlusion_left_eye = json.getJSONObject("quality").getJSONObject("occlusion").getDouble("left_eye");
			double occlusion_left_cheek = json.getJSONObject("quality").getJSONObject("occlusion").getDouble("left_cheek");
			double occlusion_chin_contour = json.getJSONObject("quality").getJSONObject("occlusion").getDouble("chin_contour");
			double occlusion_right_cheek = json.getJSONObject("quality").getJSONObject("occlusion").getDouble("right_cheek");
			
			double quality_blur = json.getJSONObject("quality").getDouble("blur");
			double quality_illumination = json.getJSONObject("quality").getDouble("illumination");
			int quality_completeness = json.getJSONObject("quality").getInt("completeness");
			
			double eye_status_left_eye = json.getJSONObject("eye_status").getDouble("left_eye");
			double eye_status_right_eye = json.getJSONObject("eye_status").getDouble("right_eye");
			
			f1=new DetectFace_List(id, face_token, beauty, age, emotion_probability, emotion_type, race_probability, race_type, expression_probability, expression_type, face_shape_probability, face_shape_type, face_type_probability, face_type_type, gender_probability, gender_type, glasses_probability, glasses_type, location_left, location_top, location_width, location_height, location_rotation, occlusion_right_eye, occlusion_nose, occlusion_mouth, occlusion_left_eye, occlusion_left_cheek, occlusion_chin_contour, occlusion_right_cheek, quality_blur, quality_illumination, quality_completeness, eye_status_left_eye, eye_status_right_eye);
			return f1;
		}
		return null;
	}
	


}
