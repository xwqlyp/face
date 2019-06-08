package com.bjym.pojo;

import java.util.List;

public class Glasses {

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
	public void setProbability(double probability) {
		this.probability = probability;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Glasses(double probability, String type) {
		super();
		this.probability = probability;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Glasses [probability=" + probability + ", type=" + type + "]";
	}
	
	
	
}
