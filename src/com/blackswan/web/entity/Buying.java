package com.blackswan.web.entity;

import java.util.Date;

public class Buying {

	private int id;
	private int fundingId;
	private int memberId;
	private Date paydate;
	private int payPr;
	private String req;
	private int state;
	private String address;
	private int addressNum;
	private String name;
	private int phone;

	public Buying() {
		// TODO Auto-generated constructor stub
	}

	public Buying(int id, int fundingId, int memberId, Date paydate, int payPr, String req, int state, String address,
			int addressNum, String name, int phone) {

		this.id = id;
		this.fundingId = fundingId;
		this.memberId = memberId;
		this.paydate = paydate;
		this.payPr = payPr;
		this.req = req;
		this.state = state;
		this.address = address;
		this.addressNum = addressNum;
		this.name = name;
		this.phone = phone;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFundingId() {
		return fundingId;
	}

	public void setFundingId(int fundingId) {
		this.fundingId = fundingId;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public Date getPaydate() {
		return paydate;
	}

	public void setPaydate(Date paydate) {
		this.paydate = paydate;
	}

	public int getPayPr() {
		return payPr;
	}

	public void setPayPr(int payPr) {
		this.payPr = payPr;
	}

	public String getReq() {
		return req;
	}

	public void setReq(String req) {
		this.req = req;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
}