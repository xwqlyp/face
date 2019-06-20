package com.bjym.pojo;



public class Face {

	private Long id;
	private String PhotoName;
	private String PhotoImg;
	private DetectFace_List face_list;
	private int type;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public DetectFace_List getFace_list() {
		return face_list;
	}
	public void setFace_list(DetectFace_List face_list) {
		this.face_list = face_list;
	}
	public Face(Long id, String photoName, String photoImg, DetectFace_List face_list) {
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
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Face(Long id, String photoName, String photoImg, DetectFace_List face_list, int type) {
		super();
		this.id = id;
		PhotoName = photoName;
		PhotoImg = photoImg;
		this.face_list = face_list;
		this.type = type;
	}
	
}
