package com.fan.model;

public class Article {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String title;
	private String content;
	private String time;
	private Integer operatorId;
	private String abContent;
	
	
	
	public String getAbContent() {
		return abContent;
	}
	public void setAbContent(String abContent) {
		this.abContent = abContent;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Integer getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(Integer operatorId) {
		this.operatorId = operatorId;
	}
	
}
