package com.blackswan.web.entity;

import java.util.Date;


public class Funding {
	
	private int id;
	private int adminId;
	private int memberId;
	private int categoryId;
	private Date regdate;
	private String title;
	private int tAmount;
	private String introImg;
	private Date sdate;
	private Date edate;
	private int hit;
	private int state;
	
	public Funding() {
		// TODO Auto-generated constructor stub
	}

	public Funding(int id, int adminId, int memberId, int categoryId, Date regdate, String title, int tAmount,
			String introImg, Date sdate, Date edate, int hit, int state) {
		this.id = id;
		this.adminId = adminId;
		this.memberId = memberId;
		this.categoryId = categoryId;
		this.regdate = regdate;
		this.title = title;
		this.tAmount = tAmount;
		this.introImg = introImg;
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

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int gettAmount() {
		return tAmount;
	}

	public void settAmount(int tAmount) {
		this.tAmount = tAmount;
	}

	public String getIntroImg() {
		return introImg;
	}

	public void setIntroImg(String introImg) {
		this.introImg = introImg;
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