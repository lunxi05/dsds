package com.blackswan.web.entity;

import java.util.Date;


public class Notice {
	private int id;
	private String type;
	private String title;
	private String writer_Id;
	private String content;
	private Date regDate;
	private int hit;
	
	public Notice() {
		// TODO Auto-generated constructor stub
	}


	public Notice(int id, String type, String title, String content, String writer_Id, Date regDate, int hit) {
		super();
		this.id = id;
		this.type = type;
		this.title = title;
		this.content=content;
		this.writer_Id = writer_Id;
		this.regDate = regDate;
		this.hit = hit;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getWriter_Id() {
		return writer_Id;
	}


	public void setWriter_Id(String writer_Id) {
		this.writer_Id = writer_Id;
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


	public int getHit() {
		return hit;
	}


	public void setHit(int hit) {
		this.hit = hit;
	}

}
	
