package com.blackswan.web.entity;

import java.util.Date;


public class FundingPrice {
	
	private int id;
	private int rPrice;
	private String rContent;
	
	public FundingPrice() {
		// TODO Auto-generated constructor stub
	}

	public FundingPrice(int id, int rPrice, String rContent) {
		this.id = id;
		this.rPrice = rPrice;
		this.rContent = rContent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getrPrice() {
		return rPrice;
	}

	public void setrPrice(int rPrice) {
		this.rPrice = rPrice;
	}

	public String getrContent() {
		return rContent;
	}

	public void setrContent(String rContent) {
		this.rContent = rContent;
	}


	
	
}