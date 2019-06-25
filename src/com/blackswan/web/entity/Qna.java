package com.blackswan.web.entity;

import java.util.Date;

public class Qna {
	private int admin_id;
	private String content; 
	private int id; 
	private String member_id; 
	private Date regdate; 
	private String reply;
	private Date r_date;
	private int secretnum; 
	private int state; 
	private String title;
	
	public Qna() {
		// TODO Auto-generated constructor stub
	}
	
	public Qna(int admin_id, String content, int id, String member_id, Date regdate, String reply, Date r_date,
			int secretnum, int state, String title) {
		super();
		this.admin_id = admin_id;
		this.content = content;
		this.id = id;
		this.member_id = member_id;
		this.regdate = regdate;
		this.reply = reply;
		this.r_date = r_date;
		this.secretnum = secretnum;
		this.state = state;
		this.title = title;
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

	public Date getR_date() {
		return r_date;
	}

	public void setR_date(Date r_date) {
		this.r_date = r_date;
	}

	public int getSecretnum() {
		return secretnum;
	}

	public void setSecretnum(int secretnum) {
		this.secretnum = secretnum;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	

}