package com.blackswan.web.entity;

import java.util.Date;

public class Qna {
	private int id;
	private int adminId;
	private int division;
	private String title;
	private String content;
	private String attach;
	private Date regdate;
	private Date sdate;
	private Date edate;
	private int hit;
	private int state;
	
	public Qna() {
		// TODO Auto-generated constructor stub
	}
	
	public Qna(int id, int adminId, int division, String title, String content, String attach, Date regdate,
			Date sdate, Date edate, int hit, int state) {
		
		this.id = id;
		this.adminId = adminId;
		this.division = division;
		this.title = title;
		this.content = content;
		this.attach = attach;
		this.regdate = regdate;
		this.sdate = sdate;
		this.edate = edate;
		this.hit = hit;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
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

	public int getDivision() {
		return division;
	}

	public void setDivision(int division) {
		this.division = division;
	}

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public Date getSdate() {
		return sdate;
	}

	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}

	public Date getEdate() {
		return edate;
	}

	public void setEdate(Date edate) {
		this.edate = edate;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	
	

}