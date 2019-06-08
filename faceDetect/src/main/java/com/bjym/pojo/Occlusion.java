package com.bjym.pojo;

public class Occlusion {
	private double right_eye;
	private double nose;
	private double mouth;
	private double left_eye;
	private double left_cheek;
	private double chin_contour;
	private double right_cheek;
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
	public double getNose() {
		return nose;
	}
	public void setNose(double nose) {
		this.nose = nose;
	}
	public double getMouth() {
		return mouth;
	}
	public void setMouth(double mouth) {
		this.mouth = mouth;
	}
	public double getLeft_eye() {
		return left_eye;
	}
	public void setLeft_eye(double left_eye) {
		this.left_eye = left_eye;
	}
	public double getLeft_cheek() {
		return left_cheek;
	}
	public void setLeft_cheek(double left_cheek) {
		this.left_cheek = left_cheek;
	}
	public double getChin_contour() {
		return chin_contour;
	}
	public void setChin_contour(double chin_contour) {
		this.chin_contour = chin_contour;
	}
	public double getRight_cheek() {
		return right_cheek;
	}
	public void setRight_cheek(double right_cheek) {
		this.right_cheek = right_cheek;
	}
	public Occlusion(double right_eye, double nose, double mouth, double left_eye, double left_cheek,
			double chin_contour, double right_cheek) {
		super();
		this.right_eye = right_eye;
		this.nose = nose;
		this.mouth = mouth;
		this.left_eye = left_eye;
		this.left_cheek = left_cheek;
		this.chin_contour = chin_contour;
		this.right_cheek = right_cheek;
	}
	@Override
	public String toString() {
		return "Occlusion [right_eye=" + right_eye + ", nose=" + nose + ", mouth=" + mouth + ", left_eye=" + left_eye
				+ ", left_cheek=" + left_cheek + ", chin_contour=" + chin_contour + ", right_cheek=" + right_cheek
				+ "]";
	}
}
