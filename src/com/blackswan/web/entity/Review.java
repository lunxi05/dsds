package com.blackswan.web.entity;

import java.util.Date;

public class Review {
	
	private int id;
	private String title;
	private String writerId;
	private String content;
	private Date regDate;

	
	public Review() {
		// TODO Auto-generated constructor stub
	}


	public Review(int id, String title, String witerId, String content, Date regDate) {
		
		this.id = id;
		this.title = title;
		this.writerId = witerId;
		this.content = content;
		this.regDate = regDate;
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


	public String getWriterId() {
		return writerId;
	}


	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Date getRegDate() {
		return regDate;
	}


	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

}
	
