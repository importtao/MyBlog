package com.fan.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.fan.model.Article;
import com.fan.model.Operator;
import com.fan.util.DataUtil;
import com.fan.util.XSSUtil;

public class ArticleDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	@NotEmpty
	private String title;
	@NotEmpty
	private String content;
	@NotEmpty
	private String operatorId;
	private String time;
	@NotEmpty
	private String abContent;

	public String getAbContent() {
		return abContent;
	}



	public void setAbContent(String abContent) {
		this.abContent = abContent;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
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



	public String getOperatorId() {
		return operatorId;
	}



	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}



	public String getTime() {
		return time;
	}



	public void setTime(String time) {
		this.time = time;
	}



	public Article toModel() {
		Article model = new Article();
		model.setId(id);
		model.setTitle(title);
		model.setContent(content);
		model.setTime(time);
		return model;
	}
}
