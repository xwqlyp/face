package com.bjym.pojo;

public class Location {
	private double left;
	private double top;
	private double width;
	private double height;
	private double rotation;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getLeft() {
		return left;
	}
	public void setLeft(double left) {
		this.left = left;
	}
	public double getTop() {
		return top;
	}
	public void setTop(double top) {
		this.top = top;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getRotation() {
		return rotation;
	}
	public void setRotation(double rotation) {
		this.rotation = rotation;
	}
	public Location(double left, double top, double width, double height, double rotation) {
		super();
		this.left = left;
		this.top = top;
		this.width = width;
		this.height = height;
		this.rotation = rotation;
	}
	@Override
	public String toString() {
		return "Location [left=" + left + ", top=" + top + ", width=" + width + ", height=" + height + ", rotation="
				+ rotation + "]";
	}
}
