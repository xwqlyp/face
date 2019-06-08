package com.bjym.pojo;

import java.util.List;

public class Quality {
	private double illumination;
	private Occlusion occlusion;
	private double blur;
	private int completeness;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getIllumination() {
		return illumination;
	}
	public void setIllumination(double illumination) {
		this.illumination = illumination;
	}
	public Occlusion getOcclusion() {
		return occlusion;
	}
	public void setOcclusion(Occlusion occlusion) {
		this.occlusion = occlusion;
	}
	public double getBlur() {
		return blur;
	}
	public void setBlur(double blur) {
		this.blur = blur;
	}
	public int getCompleteness() {
		return completeness;
	}
	public void setCompleteness(int completeness) {
		this.completeness = completeness;
	}
	public Quality(double illumination, Occlusion occlusion, double blur, int completeness) {
		super();
		this.illumination = illumination;
		this.occlusion = occlusion;
		this.blur = blur;
		this.completeness = completeness;
	}
	@Override
	public String toString() {
		return "Quality [illumination=" + illumination + ", occlusion=" + occlusion + ", blur=" + blur
				+ ", completeness=" + completeness + "]";
	}
}
