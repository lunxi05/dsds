package com.blackswan.web.dao.oracle;

import java.util.Date;

import com.blackswan.web.entity.Funding;
import com.blackswan.web.entity.Member;

public class FundingView extends Funding {

	private int num;
	private String companyName;
	private String cateName;
	private int pay;
	private int partRate;
	public FundingView() {
	}
	
	public FundingView(int num, int id, int adminId, int memberId, int categoryId, Date regdate, String title, int tAmount,
			String introImg, Date sdate, Date edate, int hit, int state, String companyName, String cateName, int pay, int partRate) {
		super(id, adminId, memberId, categoryId, regdate, title, tAmount, introImg, sdate, edate, hit, state);
		this.num = num;
		this.companyName = companyName;
		this.cateName = cateName;
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
}