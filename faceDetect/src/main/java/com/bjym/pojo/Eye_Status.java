package com.bjym.pojo;

public class Eye_Status {
	private double right_eye;
	private double left_eye;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getRight_eye() {
		return right_eye;
	}
	public void setRight_eye(double right_eye) {
		this.right_eye = right_eye;
	}
	public double getLeft_eye() {
		return left_eye;
	}
	public void setLeft_eye(double left_eye) {
		this.left_eye = left_eye;
	}
	public Eye_Status(double right_eye, double left_eye) {
		super();
		this.right_eye = right_eye;
		this.left_eye = left_eye;
	}
	@Override
	public String toString() {
		return "Eye_Status [right_eye=" + right_eye + ", left_eye=" + left_eye + "]";
	}
}
