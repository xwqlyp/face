package com.bjym.pojo;

import java.util.List;

public class Face_Shape {

	private double probability;
	private String type;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Face_Shape [probability=" + probability + ", type=" + type + "]";
	}
	public double getProbability() {
		return probability;
	}
	public void setProbability(int probability) {
		this.probability = probability;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Face_Shape(int probability, String type) {
		super();
		this.probability = probability;
		this.type = type;
	}


}
