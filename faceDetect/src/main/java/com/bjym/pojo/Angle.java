package com.bjym.pojo;

public class Angle {
	private double roll;
	private double pitch;
	private double yaw;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getRoll() {
		return roll;
	}
	public void setRoll(double roll) {
		this.roll = roll;
	}
	public double getPitch() {
		return pitch;
	}
	public void setPitch(double pitch) {
		this.pitch = pitch;
	}
	public double getYaw() {
		return yaw;
	}
	public void setYaw(double yaw) {
		this.yaw = yaw;
	}
	public Angle(double roll, double pitch, double yaw) {
		super();
		this.roll = roll;
		this.pitch = pitch;
		this.yaw = yaw;
	}
	@Override
	public String toString() {
		return "Angle [roll=" + roll + ", pitch=" + pitch + ", yaw=" + yaw + "]";
	}
}
