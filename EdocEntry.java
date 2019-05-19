package com.kgc.kd52.entity;

public class EdocEntry {
	private int id; 			//INT(10) PRIMARY KEY AUTO_INCREMENT COMMENT'编号',
	private EdocCategory categoryId;  //INT(10) NOT NULL COMMENT '分类编号',
	private String title; 		//VARCHAR(100) NOT NULL COMMENT '标题',
	private String summary;     //VARCHAR(255) COMMENT'摘要',
	private String uploaduser; //VARCHAR(50)COMMENT'上传人',
	private String createdata; //DATE COMMENT'创建时间',
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public EdocCategory getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(EdocCategory categoryId) {
		this.categoryId = categoryId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getUploaduser() {
		return uploaduser;
	}
	public void setUploaduser(String uploaduser) {
		this.uploaduser = uploaduser;
	}
	public String getCreatedata() {
		return createdata;
	}
	public void setCreatedata(String createdata) {
		this.createdata = createdata;
	}
	
	public EdocEntry() {
	}
	public EdocEntry(int id, EdocCategory categoryId, String title, String summary, String uploaduser,
			String createdata) {
		this.id = id;
		this.categoryId = categoryId;
		this.title = title;
		this.summary = summary;
		this.uploaduser = uploaduser;
		this.createdata = createdata;
	}
	@Override
	public String toString() {
		return "EdocEntry [id=" + id + ", categoryId=" + categoryId + ", title=" + title + ", summary=" + summary
				+ ", uploaduser=" + uploaduser + ", createdata=" + createdata + "]";
	}
	
	
}
