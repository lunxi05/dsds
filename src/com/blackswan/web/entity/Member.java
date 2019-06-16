package com.blackswan.web.entity;

import java.util.Date;

public class Member {
	
	private int id;
	private String email;
	private String name;
	private String pw;
	private int phone;
	private String profile;
	private String blackReason;
	private int eventCheck;
	private int adminId;
	private String address;
	private int addressNumber;
	private Date regdate;
	private String state;
	
	public Member() {
		
	}
	
	public Member(int id, String email, String name, String pw, int phone, String profile,
			String blackReason, int eventCheck, int adminId, String address, int addressNumber, Date regdate, String state) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.pw = pw;
		this.phone = phone;
		this.profile = profile;
		this.blackReason = blackReason;
		this.eventCheck = eventCheck;
		this.adminId = adminId;
		this.address = address;
		this.addressNumber = addressNumber;
		this.regdate = regdate;
		this.state = state;
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

	public String getBlackReason() {
		return blackReason;
	}

	public void setBlackReason(String blackReason) {
		this.blackReason = blackReason;
	}

	public int getEventCheck() {
		return eventCheck;
	}

	public void setEventCheck(int eventCheck) {
		this.eventCheck = eventCheck;
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

	public int getAddressNumber() {
		return addressNumber;
	}

	public void setAddressNumber(int addressNumber) {
		this.addressNumber = addressNumber;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
