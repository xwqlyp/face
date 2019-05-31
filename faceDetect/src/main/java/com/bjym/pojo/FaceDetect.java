package com.bjym.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class FaceDetect{

	private int face_num;
	//检测到的图片中的人脸数量
	private String face_token;
	//人脸图片的唯一标识
	private BigDecimal location_left;
	//人脸区域离左边界的距离
	private BigDecimal location_top;
	//人脸区域离上边界的距离
	private BigDecimal location_width;
	//人脸区域的宽度
	private BigDecimal location_height;
	//人脸区域的高度
	private BigDecimal location_rotation;
	//人脸框相对于竖直方向的顺时针旋转角，[-180,180];
	private BigDecimal face_probability;
	//人脸置信度，范围【0~1】，代表这一张人脸的概率，0最小、1最大。;
	private BigDecimal angle_yaw;
	//三维旋转之左右旋转角[-90(左),90(右)];
	private BigDecimal angle_pitch;
	//三维旋转之俯仰角度[-90(上),90(下)];
	private BigDecimal angle_roll;
	//平面内旋转角[-180(逆时针),180(顺时针)];
	private BigDecimal age;
	//年龄，当face_field包含age时返回;
	private BigDecimal beauty;
	//美丑打分，范围0-100，越大表示越美。当face_fields包含beauty时返回;
	private String expression_type;
	//none:不笑；smile:微笑；laugh:大笑;
	private BigDecimal expression_probability;
	//表情置信度，范围【0~1】，0最小、1最大。;
	private BigDecimal face_shape_type;
	//square正方形triangle:三角形oval:椭圆heart:心形round:圆形;
	private BigDecimal face_shape_probability;
	//置信度，范围【0~1】，代表这人脸形状判断正确的概率，0最小、1最大。;
	private String egender_type;
	//male:男性female:女性;
	private BigDecimal gender_probability;
	//性别置信度，范围【0~1】，0代表概率最小、1代表最大。;
	private String glasses_type;
	//none:无眼镜，common:普通眼镜，sun:墨镜;
	private BigDecimal glasses_probability;
	//眼镜置信度，范围【0~1】，0代表概率最小、1代表最大。;
	private String eye_status;
	//双眼状态（睁开/闭合）face_field包含eye_status时返回;
	private BigDecimal eye_status_left_eye;
	//左眼状态[0,1]取值，越接近0闭合的可能性越大;
	private BigDecimal eye_status_right_eye;
	//右眼状态[0,1]取值，越接近0闭合的可能性越大;
	private String emotion_type;
	//angry:愤怒disgust:厌恶fear:恐惧happy:高兴sad:伤心surprise:惊讶neutral:无情绪;
	private BigDecimal emotion_probability;
	//情绪置信度，范围0~1;
	private String race;
	//人种face_field包含race时返回;
	private String race_type;
	//yellow:黄种人white:白种人black:黑种人arabs:阿拉伯人;
	private BigDecimal race_probability;
	//人种置信度，范围【0~1】，0代表概率最小、1代表最大。;
	private String face_type_type;
	//human:真实人脸cartoon:卡通人脸;
	private BigDecimal face_type_probability;
	//人脸类型判断正确的置信度，范围【0~1】，0代表概率最小、1代表最大。;
	private String landmark;
	//4个关键点位置，左眼中心、右眼中心、鼻尖、嘴中心。face_field包含landmark时返回;
	private String landmark72;
	//72个特征点位置face_field包含landmark72时返回;
	private String landmark150;
	//150个特征点位置face_field包含landmark150时返回;
	private BigDecimal occlusion_left_eye;
	//左眼遮挡比例，[0-1]，1表示完全遮挡;
	private BigDecimal occlusion_right_eye;
	//右眼遮挡比例，[0-1]，1表示完全遮挡;
	private BigDecimal occlusion_nose;
	//鼻子遮挡比例，[0-1]，1表示完全遮挡;
	private BigDecimal occlusion_mouth;
	//嘴巴遮挡比例，[0-1]，1表示完全遮挡;
	private BigDecimal occlusion_left_cheek;
	//左脸颊遮挡比例，[0-1]，1表示完全遮挡;
	private BigDecimal occlusion_right_cheek;
	//右脸颊遮挡比例，[0-1]，1表示完全遮挡;
	private BigDecimal occlusion_chin;
	//下巴遮挡比例，，[0-1]，1表示完全遮挡;
	private BigDecimal blur;
	//人脸模糊程度，范围[0~1]，0表示清晰，1表示模糊;
	private BigDecimal illumination;
	//取值范围在[0~255],表示脸部区域的光照程度越大表示光照越好;
	private BigDecimal completenessint;
	//人脸完整度，0或1,0为人脸溢出图像边界，1为人脸都在图像边界内//
	
	@Override
	public String toString() {
		return "Product [face_num=" + face_num + ", face_token=" + face_token + ", location_left=" + location_left
				+ ", location_top=" + location_top + ", location_width=" + location_width + ", location_height="
				+ location_height + ", location_rotation=" + location_rotation + ", face_probability="
				+ face_probability + ", angle_yaw=" + angle_yaw + ", angle_pitch=" + angle_pitch + ", angle_roll="
				+ angle_roll + ", age=" + age + ", beauty=" + beauty + ", expression_type=" + expression_type
				+ ", expression_probability=" + expression_probability + ", face_shape_type=" + face_shape_type
				+ ", face_shape_probability=" + face_shape_probability + ", egender_type=" + egender_type
				+ ", gender_probability=" + gender_probability + ", glasses_type=" + glasses_type
				+ ", glasses_probability=" + glasses_probability + ", eye_status=" + eye_status
				+ ", eye_status_left_eye=" + eye_status_left_eye + ", eye_status_right_eye=" + eye_status_right_eye
				+ ", emotion_type=" + emotion_type + ", emotion_probability=" + emotion_probability + ", race=" + race
				+ ", race_type=" + race_type + ", race_probability=" + race_probability + ", face_type_type="
				+ face_type_type + ", face_type_probability=" + face_type_probability + ", landmark=" + landmark
				+ ", landmark72=" + landmark72 + ", landmark150=" + landmark150 + ", occlusion_left_eye="
				+ occlusion_left_eye + ", occlusion_right_eye=" + occlusion_right_eye + ", occlusion_nose="
				+ occlusion_nose + ", occlusion_mouth=" + occlusion_mouth + ", occlusion_left_cheek="
				+ occlusion_left_cheek + ", occlusion_right_cheek=" + occlusion_right_cheek + ", occlusion_chin="
				+ occlusion_chin + ", blur=" + blur + ", illumination=" + illumination + ", completenessint="
				+ completenessint + "]";
	}
	public int getFace_num() {
		return face_num;
	}
	public void setFace_num(int face_num) {
		this.face_num = face_num;
	}
	public String getFace_token() {
		return face_token;
	}
	public void setFace_token(String face_token) {
		this.face_token = face_token;
	}
	public BigDecimal getLocation_left() {
		return location_left;
	}
	public void setLocation_left(BigDecimal location_left) {
		this.location_left = location_left;
	}
	public BigDecimal getLocation_top() {
		return location_top;
	}
	public void setLocation_top(BigDecimal location_top) {
		this.location_top = location_top;
	}
	public BigDecimal getLocation_width() {
		return location_width;
	}
	public void setLocation_width(BigDecimal location_width) {
		this.location_width = location_width;
	}
	public BigDecimal getLocation_height() {
		return location_height;
	}
	public void setLocation_height(BigDecimal location_height) {
		this.location_height = location_height;
	}
	public BigDecimal getLocation_rotation() {
		return location_rotation;
	}
	public void setLocation_rotation(BigDecimal location_rotation) {
		this.location_rotation = location_rotation;
	}
	public BigDecimal getFace_probability() {
		return face_probability;
	}
	public void setFace_probability(BigDecimal face_probability) {
		this.face_probability = face_probability;
	}
	public BigDecimal getAngle_yaw() {
		return angle_yaw;
	}
	public void setAngle_yaw(BigDecimal angle_yaw) {
		this.angle_yaw = angle_yaw;
	}
	public BigDecimal getAngle_pitch() {
		return angle_pitch;
	}
	public void setAngle_pitch(BigDecimal angle_pitch) {
		this.angle_pitch = angle_pitch;
	}
	public BigDecimal getAngle_roll() {
		return angle_roll;
	}
	public void setAngle_roll(BigDecimal angle_roll) {
		this.angle_roll = angle_roll;
	}
	public BigDecimal getAge() {
		return age;
	}
	public void setAge(BigDecimal age) {
		this.age = age;
	}
	public BigDecimal getBeauty() {
		return beauty;
	}
	public void setBeauty(BigDecimal beauty) {
		this.beauty = beauty;
	}
	public String getExpression_type() {
		return expression_type;
	}
	public void setExpression_type(String expression_type) {
		this.expression_type = expression_type;
	}
	public BigDecimal getExpression_probability() {
		return expression_probability;
	}
	public void setExpression_probability(BigDecimal expression_probability) {
		this.expression_probability = expression_probability;
	}
	public BigDecimal getFace_shape_type() {
		return face_shape_type;
	}
	public void setFace_shape_type(BigDecimal face_shape_type) {
		this.face_shape_type = face_shape_type;
	}
	public BigDecimal getFace_shape_probability() {
		return face_shape_probability;
	}
	public void setFace_shape_probability(BigDecimal face_shape_probability) {
		this.face_shape_probability = face_shape_probability;
	}
	public String getEgender_type() {
		return egender_type;
	}
	public void setEgender_type(String egender_type) {
		this.egender_type = egender_type;
	}
	public BigDecimal getGender_probability() {
		return gender_probability;
	}
	public void setGender_probability(BigDecimal gender_probability) {
		this.gender_probability = gender_probability;
	}
	public String getGlasses_type() {
		return glasses_type;
	}
	public void setGlasses_type(String glasses_type) {
		this.glasses_type = glasses_type;
	}
	public BigDecimal getGlasses_probability() {
		return glasses_probability;
	}
	public void setGlasses_probability(BigDecimal glasses_probability) {
		this.glasses_probability = glasses_probability;
	}
	public String getEye_status() {
		return eye_status;
	}
	public void setEye_status(String eye_status) {
		this.eye_status = eye_status;
	}
	public BigDecimal getEye_status_left_eye() {
		return eye_status_left_eye;
	}
	public void setEye_status_left_eye(BigDecimal eye_status_left_eye) {
		this.eye_status_left_eye = eye_status_left_eye;
	}
	public BigDecimal getEye_status_right_eye() {
		return eye_status_right_eye;
	}
	public void setEye_status_right_eye(BigDecimal eye_status_right_eye) {
		this.eye_status_right_eye = eye_status_right_eye;
	}
	public String getEmotion_type() {
		return emotion_type;
	}
	public void setEmotion_type(String emotion_type) {
		this.emotion_type = emotion_type;
	}
	public BigDecimal getEmotion_probability() {
		return emotion_probability;
	}
	public void setEmotion_probability(BigDecimal emotion_probability) {
		this.emotion_probability = emotion_probability;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getRace_type() {
		return race_type;
	}
	public void setRace_type(String race_type) {
		this.race_type = race_type;
	}
	public BigDecimal getRace_probability() {
		return race_probability;
	}
	public void setRace_probability(BigDecimal race_probability) {
		this.race_probability = race_probability;
	}
	public String getFace_type_type() {
		return face_type_type;
	}
	public void setFace_type_type(String face_type_type) {
		this.face_type_type = face_type_type;
	}
	public BigDecimal getFace_type_probability() {
		return face_type_probability;
	}
	public void setFace_type_probability(BigDecimal face_type_probability) {
		this.face_type_probability = face_type_probability;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getLandmark72() {
		return landmark72;
	}
	public void setLandmark72(String landmark72) {
		this.landmark72 = landmark72;
	}
	public String getLandmark150() {
		return landmark150;
	}
	public void setLandmark150(String landmark150) {
		this.landmark150 = landmark150;
	}
	public BigDecimal getOcclusion_left_eye() {
		return occlusion_left_eye;
	}
	public void setOcclusion_left_eye(BigDecimal occlusion_left_eye) {
		this.occlusion_left_eye = occlusion_left_eye;
	}
	public BigDecimal getOcclusion_right_eye() {
		return occlusion_right_eye;
	}
	public void setOcclusion_right_eye(BigDecimal occlusion_right_eye) {
		this.occlusion_right_eye = occlusion_right_eye;
	}
	public BigDecimal getOcclusion_nose() {
		return occlusion_nose;
	}
	public void setOcclusion_nose(BigDecimal occlusion_nose) {
		this.occlusion_nose = occlusion_nose;
	}
	public BigDecimal getOcclusion_mouth() {
		return occlusion_mouth;
	}
	public void setOcclusion_mouth(BigDecimal occlusion_mouth) {
		this.occlusion_mouth = occlusion_mouth;
	}
	public BigDecimal getOcclusion_left_cheek() {
		return occlusion_left_cheek;
	}
	public void setOcclusion_left_cheek(BigDecimal occlusion_left_cheek) {
		this.occlusion_left_cheek = occlusion_left_cheek;
	}
	public BigDecimal getOcclusion_right_cheek() {
		return occlusion_right_cheek;
	}
	public void setOcclusion_right_cheek(BigDecimal occlusion_right_cheek) {
		this.occlusion_right_cheek = occlusion_right_cheek;
	}
	public BigDecimal getOcclusion_chin() {
		return occlusion_chin;
	}
	public void setOcclusion_chin(BigDecimal occlusion_chin) {
		this.occlusion_chin = occlusion_chin;
	}
	public BigDecimal getBlur() {
		return blur;
	}
	public void setBlur(BigDecimal blur) {
		this.blur = blur;
	}
	public BigDecimal getIllumination() {
		return illumination;
	}
	public void setIllumination(BigDecimal illumination) {
		this.illumination = illumination;
	}
	public BigDecimal getCompletenessint() {
		return completenessint;
	}
	public void setCompletenessint(BigDecimal completenessint) {
		this.completenessint = completenessint;
	}

}
