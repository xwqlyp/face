package com.bjym.pojo;

import java.util.List;
import java.util.Map;

public class Face_List {
	
	private Expression expression;
	private Face_Shape face_shape;
	private double beauty;
	private Gender gender;
	private Race race;
	private Eye_Status eye_status;
	private double face_probability;
	private Quality quality;
	private Glasses glasses;
	private Emotion emotion;
	private Face_Type face_type;
	private Angle angle;
	private String face_token;
	private Location location;
	private int age;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Expression getExpression() {
		return expression;
	}
	public void setExpression(Expression expression) {
		this.expression = expression;
	}
	public Face_Shape getFace_shape() {
		return face_shape;
	}
	public void setFace_shape(Face_Shape face_shape) {
		this.face_shape = face_shape;
	}
	public double getBeauty() {
		return beauty;
	}
	public void setBeauty(double beauty) {
		this.beauty = beauty;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Race getRace() {
		return race;
	}
	public void setRace(Race race) {
		this.race = race;
	}
	public Eye_Status getEye_status() {
		return eye_status;
	}
	public void setEye_status(Eye_Status eye_status) {
		this.eye_status = eye_status;
	}
	public double getFace_probability() {
		return face_probability;
	}
	public void setFace_probability(double face_probability) {
		this.face_probability = face_probability;
	}
	public Quality getQuality() {
		return quality;
	}
	public void setQuality(Quality quality) {
		this.quality = quality;
	}
	public Glasses getGlasses() {
		return glasses;
	}
	public void setGlasses(Glasses glasses) {
		this.glasses = glasses;
	}
	public Emotion getEmotion() {
		return emotion;
	}
	public void setEmotion(Emotion emotion) {
		this.emotion = emotion;
	}
	public Face_Type getFace_type() {
		return face_type;
	}
	public void setFace_type(Face_Type face_type) {
		this.face_type = face_type;
	}
	public Angle getAngle() {
		return angle;
	}
	public void setAngle(Angle angle) {
		this.angle = angle;
	}
	public String getFace_token() {
		return face_token;
	}
	public void setFace_token(String face_token) {
		this.face_token = face_token;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Face_List [id=" + id + ", expression=" + expression + ", face_shape=" + face_shape + ", beauty="
				+ beauty + ", gender=" + gender + ", race=" + race + ", eye_status=" + eye_status
				+ ", face_probability=" + face_probability + ", quality=" + quality + ", glasses=" + glasses
				+ ", emotion=" + emotion + ", face_type=" + face_type + ", angle=" + angle + ", face_token="
				+ face_token + ", location=" + location + ", age=" + age + "]";
	}
	public Face_List( Expression expression, Face_Shape face_shape, double beauty, Gender gender, Race race,
			Eye_Status eye_status, double face_probability, Quality quality, Glasses glasses, Emotion emotion,
			Face_Type face_type, Angle angle, String face_token, Location location, int age) {
		super();
		this.id = id;
		this.expression = expression;
		this.face_shape = face_shape;
		this.beauty = beauty;
		this.gender = gender;
		this.race = race;
		this.eye_status = eye_status;
		this.face_probability = face_probability;
		this.quality = quality;
		this.glasses = glasses;
		this.emotion = emotion;
		this.face_type = face_type;
		this.angle = angle;
		this.face_token = face_token;
		this.location = location;
		this.age = age;
	}
	
	
}
