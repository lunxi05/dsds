package com.blackswan.web.entity;

import java.util.Date;

public class Member {
	
	private int id;
	private String email;
	private String name;
	private String pwd;
	private String phone;
	private String address;
	private String profile;
	private int black;
	private String black_r;
	private Date regdate;
	private int agree;
	private String condition;
	
	public Member() {

	}
	
	public Member(int id, int black, String email, String name, Date regdate, String condition) {
		this.id = id;
		this.black = black;
		this.email = email;
		this.name = name;
		this.regdate = regdate;
		this.condition = condition;
	}
	
	public Member(int id, String email, String name, String pwd, String phone, String address, 
			String profile, int black, String black_r, Date regdate, int agree, String condition) {
		this.id = id;
		this.email = email;
		this.name = name;
		this.pwd = pwd;
		this.phone = phone;
		this.address = address;
		this.profile = profile;
		this.black = black;
		this.black_r = black_r;
		this.regdate = regdate;
		this.agree = agree;
		this.condition = condition;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public int getBlack() {
		return black;
	}

	public void setBlack(int black) {
		this.black = black;
	}

	public String getBlack_r() {
		return black_r;
	}

	public void setBlack_r(String black_r) {
		this.black_r = black_r;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public int getAgree() {
		return agree;
	}

	public void setAgree(int agree) {
		this.agree = agree;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

}
