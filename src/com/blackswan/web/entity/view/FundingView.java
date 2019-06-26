package com.blackswan.web.entity.view;

import java.util.Date;

import com.blackswan.web.entity.Funding;

public class FundingView extends Funding {

	private int num;
	private String companyName;
	private String cateName;
	private int payc;
	private int pay;
	private int partRate;
	
	
	
	
	public FundingView() {
		// TODO Auto-generated constructor stub
	}
	


	public FundingView(int num, int id, int adminId, int memberId, int categoryId, Date regdate, String title, int tAmount,
			String introImg, String sdate, String edate, int hit, int state, String content, String companyName, String cateName, int payc ,int pay, int partRate) {
		super(id, adminId, memberId, categoryId, regdate, title, tAmount, introImg, sdate, edate, hit, state, content);
		this.num = num;
		this.companyName = companyName;
		this.cateName = cateName;
		this.payc = payc;
		this.pay = pay;
		this.partRate = partRate;
	}


	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCateName() {
		return cateName;
	}

	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public int getPartRate() {
		return partRate;
	}

	public void setPartRate(int partRate) {
		this.partRate = partRate;
	}

	public int getPayc() {
		return payc;
	}

	public void setPayc(int payc) {
		this.payc = payc;
	}
	
	
}