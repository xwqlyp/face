package com.bjym.pojo;

public class Face_Type {
	private double probability;
	private String type;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Face_Type(int probability, String type) {
		super();
		this.probability = probability;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Face_Type [probability=" + probability + ", type=" + type + "]";
	}
	
}
