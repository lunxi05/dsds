package com.blackswan.web.dao.oracle;

import java.util.Date;

import com.blackswan.web.entity.Funding;
import com.blackswan.web.entity.Member;

public class FundingView extends Funding {

	
	private int id;
	private int categoryId;
	private Date regdate;
	private	String title;
	private int t_amount;
	private	String introImg;
	private int sid;
	private	String companyName;
	private String categoryName;
	private int pay;

	
	public FundingView() {
		// TODO Auto-generated constructor stub
	}

	
	
	public FundingView(int id, int categoryId, Date regdate, String title, int t_amount, String introImg, int sid,
			String companyName, String categoryName, int pay) {
		this.id = id;
		this.categoryId = categoryId;	
		this.regdate = regdate;
		this.title = title;
		this.t_amount = t_amount;
		this.introImg = introImg;
		this.sid = sid;
		this.companyName = companyName;
		this.categoryName = categoryName;
		this.pay = pay;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getCategoryId() {
		return categoryId;
	}



	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}



	public Date getRegdate() {
		return regdate;
	}



	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public int getT_amount() {
		return t_amount;
	}



	public void setT_amount(int t_amount) {
		this.t_amount = t_amount;
	}



	public String getIntroImg() {
		return introImg;
	}



	public void setIntroImg(String introImg) {
		this.introImg = introImg;
	}



	public int getPay() {
		return pay;
	}



	public void setPay(int pay) {
		this.pay = pay;
	}



	public int getSid() {
		return sid;
	}
	
	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}