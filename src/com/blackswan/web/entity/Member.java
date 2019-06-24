package com.blackswan.web.entity;

import java.util.Date;

public class Member {
	
	private int id;
	private String email;
	private String name;
	private String pw;
	private int phone;
	private String profile;
	private String eventAgree;
	private int adminId;
	private String address;
	private int addressNum;
	private Date regdate;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
	
	public Member(int id, String email, String name, String pw, int phone, String profile, String eventAgree,
			int adminId, String address, int addressNum, Date regdate) {
		
		this.id = id;
		this.email = email;
		this.name = name;
		this.pw = pw;
		this.phone = phone;
		this.profile = profile;
		this.eventAgree = eventAgree;
		this.adminId = adminId;
		this.address = address;
		this.addressNum = addressNum;
		this.regdate = regdate;
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

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getEventAgree() {
		return eventAgree;
	}

	public void setEventAgree(String eventAgree) {
		this.eventAgree = eventAgree;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAddressNum() {
		return addressNum;
	}

	public void setAddressNum(int addressNum) {
		this.addressNum = addressNum;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	

	
}
