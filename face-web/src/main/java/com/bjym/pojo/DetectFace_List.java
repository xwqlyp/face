package com.bjym.pojo;

import java.util.List;
import java.util.Map;

public class DetectFace_List {

	private Long id;
	private String face_token;
	private double beauty;
//	'美丑打分，范围0-100，越大表示越美';
	private int age ;
//	int(3) DEFAULT NULL COMMENT  '年龄';  
	private double emotion_probability;
//	double(6;2) DEFAULT NULL COMMENT '情绪置信度，范围0~1';
	private String  emotion_type;
//	'angry:愤怒 disgust:厌恶 fear:恐惧 happy:高兴 sad:伤心 surprise:惊讶 neutral:无情绪';
	private double race_probability ;
//	'人脸类型判断正确的置信度，范围【0~1】，0代表概率最小、1代表最大';
	private String  race_type ;
//	varchar(20) DEFAULT NULL COMMENT 'yellow: 黄种人 white: 白种人 black:黑种人 arabs: 阿拉伯人';
	private double expression_probability ;
//	double(6;2) DEFAULT NULL COMMENT '表情';
	private String expression_type ;
//	varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT 'none:不笑；smile:微笑；laugh:大笑';
	private double face_shape_probability;
//	double(6;2) DEFAULT NULL COMMENT '置信度，范围【0~1】，代表这是人脸形状判断正确的概率，0最小、1最大。';
	private String face_shape_type ;
//	varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT 'square: 正方形 triangle:三角形 oval: 椭圆 heart: 心形 round: 圆形';
	private double face_type_probability;
//	double(6;2) DEFAULT NULL COMMENT '人脸类型判断正确的置信度，范围【0~1】，0代表概率最小、1代表最大';
	private String face_type_type;
//	varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT 'human: 真实人脸 cartoon: 卡通人脸';
	private double gender_probability;
//	double(6;2) DEFAULT NULL COMMENT 'male:男性 female:女性';
	private String gender_type ;
//	varchar(20) DEFAULT NULL COMMENT '性别置信度，范围【0~1】，0代表概率最小、1代表最大。';
	private double glasses_probability;
//	double(6;2) DEFAULT NULL COMMENT '眼镜置信度，范围【0~1】，0代表概率最小、1代表最大。';
	private String glasses_type;
//	varchar(20) DEFAULT NULL COMMENT 'none:无眼镜，common:普通眼镜，sun:墨镜';
	private double location_left;
//	double(6;4) DEFAULT NULL COMMENT '右眼遮挡比例，[0-1] ， 1表示完全遮挡';
	private double location_top;
//	double(6;4) DEFAULT NULL COMMENT '眼镜置信度，范围【0~1】，0代表概率最小、1代表最大。';
	private double location_width;
//	double(6;4) DEFAULT NULL COMMENT '眼镜置信度，范围【0~1】，0代表概率最小、1代表最大。';
	private double location_height;
//	double(6;4) DEFAULT NULL COMMENT '左眼遮挡比例，[0-1] ，1表示完全遮挡';
	private double location_rotation;
//	double(6;4) DEFAULT NULL COMMENT '左脸颊遮挡比例，[0-1] ， 1表示完全遮挡';
	private double occlusion_right_eye;
//	double(6;4) DEFAULT NULL COMMENT '右眼遮挡比例，[0-1] ， 1表示完全遮挡';
	private double occlusion_nose;
//	double(6;4) DEFAULT NULL COMMENT '眼镜置信度，范围【0~1】，0代表概率最小 1代表最大。';
	private double occlusion_mouth;
//	double(6;4) DEFAULT NULL COMMENT '眼镜置信度，范围【0~1】，0代表概率最小 1代表最大。';
	private double occlusion_left_eye;
//	double(6;4) DEFAULT NULL COMMENT '左眼遮挡比例，[0-1] ，1表示完全遮挡';
	private double occlusion_left_cheek;
//	double(6;4) DEFAULT NULL COMMENT '左脸颊遮挡比例，[0-1] ， 1表示完全遮挡';
	private double occlusion_chin_contour;
//	double(6;4) DEFAULT NULL COMMENT '眼镜置信度，范围【0~1】，0代表概率最小、1代表最大。';
	private double occlusion_right_cheek;
//	double(6;4) DEFAULT NULL COMMENT '眼镜置信度，范围【0~1】，0代表概率最小、1代表最大。';
	private double quality_blur;
//	double(6;2) DEFAULT NULL COMMENT '人脸模糊程度，范围[0~1]，0表示清晰，1表示模糊';
	private double quality_illumination;
//	double(6;2) DEFAULT NULL COMMENT '取值范围在[0~255]; 表示脸部区域的光照程度 越大表示光照越好';
	private int quality_completeness;
//	int(2) DEFAULT NULL COMMENT '人脸完整度，0或1; 0为人脸溢出图像边界，1为人脸都在图像边界内';
	private double eye_status_left_eye;
//	double(6;2) DEFAULT NULL COMMENT '左眼状态 [0;1]取值，越接近0闭合的可能性越大';
	private double eye_status_right_eye;
//	double(6;2) DEFAULT NULL COMMENT '右眼状态 [0;1]取值，越接近0闭合的可能性越大';
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getBeauty() {
		return beauty;
	}
	
	public void setBeauty(double beauty) {
		this.beauty = beauty;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getEmotion_probability() {
		return emotion_probability;
	}
	public void setEmotion_probability(double emotion_probability) {
		this.emotion_probability = emotion_probability;
	}
	public String getEmotion_type() {
		return emotion_type;
	}
	public void setEmotion_type(String emotion_type) {
		this.emotion_type = emotion_type;
	}
	public double getRace_probability() {
		return race_probability;
	}
	public void setRace_probability(double race_probability) {
		this.race_probability = race_probability;
	}
	public String getRace_type() {
		return race_type;
	}
	public void setRace_type(String race_type) {
		this.race_type = race_type;
	}

	public double getExpression_probability() {
		return expression_probability;
	}
	public void setExpression_probability(double expression_probability) {
		this.expression_probability = expression_probability;
	}
	public String getExpression_type() {
		return expression_type;
	}
	public void setExpression_type(String expression_type) {
		this.expression_type = expression_type;
	}

	public double getFace_shape_probability() {
		return face_shape_probability;
	}
	public void setFace_shape_probability(double face_shape_probability) {
		this.face_shape_probability = face_shape_probability;
	}
	public String getFace_shape_type() {
		return face_shape_type;
	}
	public void setFace_shape_type(String face_shape_type) {
		this.face_shape_type = face_shape_type;
	}
	public double getFace_type_probability() {
		return face_type_probability;
	}
	public void setFace_type_probability(double face_type_probability) {
		this.face_type_probability = face_type_probability;
	}
	public String getFace_type_type() {
		return face_type_type;
	}
	public void setFace_type_type(String face_type_type) {
		this.face_type_type = face_type_type;
	}
	public double getGender_probability() {
		return gender_probability;
	}
	public void setGender_probability(double gender_probability) {
		this.gender_probability = gender_probability;
	}
	public String getGender_type() {
		return gender_type;
	}
	public void setGender_type(String gender_type) {
		this.gender_type = gender_type;
	}
	public double getGlasses_probability() {
		return glasses_probability;
	}
	public void setGlasses_probability(double glasses_probability) {
		this.glasses_probability = glasses_probability;
	}
	public String getGlasses_type() {
		return glasses_type;
	}
	public void setGlasses_type(String glasses_type) {
		this.glasses_type = glasses_type;
	}
	public double getLocation_left() {
		return location_left;
	}
	public void setLocation_left(double location_left) {
		this.location_left = location_left;
	}
	public double getLocation_top() {
		return location_top;
	}
	public void setLocation_top(double location_top) {
		this.location_top = location_top;
	}
	public double getLocation_width() {
		return location_width;
	}
	public void setLocation_width(double location_width) {
		this.location_width = location_width;
	}
	public double getLocation_height() {
		return location_height;
	}
	public void setLocation_height(double location_height) {
		this.location_height = location_height;
	}
	public double getLocation_rotation() {
		return location_rotation;
	}
	public void setLocation_rotation(double location_rotation) {
		this.location_rotation = location_rotation;
	}
	public double getOcclusion_right_eye() {
		return occlusion_right_eye;
	}
	public void setOcclusion_right_eye(double occlusion_right_eye) {
		this.occlusion_right_eye = occlusion_right_eye;
	}
	public double getOcclusion_nose() {
		return occlusion_nose;
	}
	public void setOcclusion_nose(double occlusion_nose) {
		this.occlusion_nose = occlusion_nose;
	}
	public double getOcclusion_mouth() {
		return occlusion_mouth;
	}
	public void setOcclusion_mouth(double occlusion_mouth) {
		this.occlusion_mouth = occlusion_mouth;
	}
	public double getOcclusion_left_eye() {
		return occlusion_left_eye;
	}
	public void setOcclusion_left_eye(double occlusion_left_eye) {
		this.occlusion_left_eye = occlusion_left_eye;
	}
	public double getOcclusion_left_cheek() {
		return occlusion_left_cheek;
	}
	public void setOcclusion_left_cheek(double occlusion_left_cheek) {
		this.occlusion_left_cheek = occlusion_left_cheek;
	}
	public double getOcclusion_chin_contour() {
		return occlusion_chin_contour;
	}
	public void setOcclusion_chin_contour(double occlusion_chin_contour) {
		this.occlusion_chin_contour = occlusion_chin_contour;
	}
	public double getOcclusion_right_cheek() {
		return occlusion_right_cheek;
	}
	public void setOcclusion_right_cheek(double occlusion_right_cheek) {
		this.occlusion_right_cheek = occlusion_right_cheek;
	}
	public double getQuality_blur() {
		return quality_blur;
	}
	public void setQuality_blur(double quality_blur) {
		this.quality_blur = quality_blur;
	}
	public double getQuality_illumination() {
		return quality_illumination;
	}
	public void setQuality_illumination(double quality_illumination) {
		this.quality_illumination = quality_illumination;
	}
	public int getQuality_completeness() {
		return quality_completeness;
	}
	public void setQuality_completeness(int quality_completeness) {
		this.quality_completeness = quality_completeness;
	}
	public double getEye_status_left_eye() {
		return eye_status_left_eye;
	}
	public void setEye_status_left_eye(double eye_status_left_eye) {
		this.eye_status_left_eye = eye_status_left_eye;
	}
	public double getEye_status_right_eye() {
		return eye_status_right_eye;
	}
	public void setEye_status_right_eye(double eye_status_right_eye) {
		this.eye_status_right_eye = eye_status_right_eye;
	}
	
	public String getFace_token() {
		return face_token;
	}
	public void setFace_token(String face_token) {
		this.face_token = face_token;
	}
	public DetectFace_List(Long id, String face_token, double beauty, int age, double emotion_probability,
			String emotion_type, double race_probability, String race_type, double expression_probability,
			String expression_type, double face_shape_probability, String face_shape_type, double face_type_probability,
			String face_type_type, double gender_probability, String gender_type, double glasses_probability,
			String glasses_type, double location_left, double location_top, double location_width,
			double location_height, double location_rotation, double occlusion_right_eye, double occlusion_nose,
			double occlusion_mouth, double occlusion_left_eye, double occlusion_left_cheek,
			double occlusion_chin_contour, double occlusion_right_cheek, double quality_blur,
			double quality_illumination, int quality_completeness, double eye_status_left_eye,
			double eye_status_right_eye) {
		super();
		this.id = id;
		this.face_token = face_token;
		this.beauty = beauty;
		this.age = age;
		this.emotion_probability = emotion_probability;
		this.emotion_type = emotion_type;
		this.race_probability = race_probability;
		this.race_type = race_type;
		this.expression_probability = expression_probability;
		this.expression_type = expression_type;
		this.face_shape_probability = face_shape_probability;
		this.face_shape_type = face_shape_type;
		this.face_type_probability = face_type_probability;
		this.face_type_type = face_type_type;
		this.gender_probability = gender_probability;
		this.gender_type = gender_type;
		this.glasses_probability = glasses_probability;
		this.glasses_type = glasses_type;
		this.location_left = location_left;
		this.location_top = location_top;
		this.location_width = location_width;
		this.location_height = location_height;
		this.location_rotation = location_rotation;
		this.occlusion_right_eye = occlusion_right_eye;
		this.occlusion_nose = occlusion_nose;
		this.occlusion_mouth = occlusion_mouth;
		this.occlusion_left_eye = occlusion_left_eye;
		this.occlusion_left_cheek = occlusion_left_cheek;
		this.occlusion_chin_contour = occlusion_chin_contour;
		this.occlusion_right_cheek = occlusion_right_cheek;
		this.quality_blur = quality_blur;
		this.quality_illumination = quality_illumination;
		this.quality_completeness = quality_completeness;
		this.eye_status_left_eye = eye_status_left_eye;
		this.eye_status_right_eye = eye_status_right_eye;
	}
	
	
	
	
	
	
	
	
}
