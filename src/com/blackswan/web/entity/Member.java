package com.blackswan.web.entity;

import java.util.Date;

public class Member {
	
	private String email;
	private String name;
	private String pwd;
	private String phone;
	private String address;
	private int black;
	private Date regDate;
	private String condition;
	
	public Member(String email, String name, String pwd, String phone, String address, int black, Date regDate, String condition) {
		this.email = email;
		this.name = name;
		this.pwd = pwd;
		this.phone = phone;
		this.address = address;
		this.black = black;
		this.regDate = regDate;
		this.condition = condition;
	}

	public String getMail() {
		return email;
	}

	public void setMail(String mail) {
		this.email = mail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getBlack() {
		return black;
	}

	public void setBlack(int black) {
		this.black = black;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	
}
