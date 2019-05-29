package com.blackswan.web.entity;

import java.util.Date;

public class Member {
	
	private int num;
	private int black;
	private String email;
	private String name;
	private Date regdate;
	private String condition;
	
	public Member(int num, int black, String email, String name, Date regdate, String condition) {
		this.num = num;
		this.black = black;
		this.email = email;
		this.name = name;
		this.regdate = regdate;
		this.condition = condition;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getBlack() {
		return black;
	}

	public void setBlack(int black) {
		this.black = black;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	
}
