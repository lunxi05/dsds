package com.blackswan.web.entity.view;


public class ReviewView {
	
	private String buyid;
	private String title;
	private String content;
	private int fid;
	private String regDate;
	
	public ReviewView() {
		// TODO Auto-generated constructor stub
	}

	public ReviewView(String buyid, String title, String content, int fid, String regDate) {
		this.buyid = buyid;
		this.title = title;
		this.content = content;
		this.fid = fid;
		this.regDate = regDate;
	}


	

	public String getBuyid() {
		return buyid;
	}
	public void setBuyid(String buyid) {
		this.buyid = buyid;
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
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	

	

}
	
