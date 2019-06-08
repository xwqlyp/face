package com.bjym.pojo;



public class Face {

	private Integer id;
	private String PhotoName;
	private String PhotoImg;
	private Face_List face_list;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPhotoName() {
		return PhotoName;
	}
	public void setPhotoName(String photoName) {
		PhotoName = photoName;
	}
	public String getPhotoImg() {
		return PhotoImg;
	}
	public void setPhotoImg(String photoImg) {
		PhotoImg = photoImg;
	}
	public Face_List getFace_list() {
		return face_list;
	}
	public void setFace_list(Face_List face_list) {
		this.face_list = face_list;
	}
	public Face(Integer id, String photoName, String photoImg, Face_List face_list) {
		super();
		this.id = id;
		PhotoName = photoName;
		PhotoImg = photoImg;
		this.face_list = face_list;
	}

	@Override
	public String toString() {
		return "Face [id=" + id + ", PhotoName=" + PhotoName + ", PhotoImg=" + PhotoImg + ", face_list=" + face_list
				+ "]";
	}
	public Face() {
		super();
	}
	
}
