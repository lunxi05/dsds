package com.blackswan.web.dao.oracle;

import java.util.Date;

import com.blackswan.web.entity.Funding;
import com.blackswan.web.entity.Member;

public class FundingView extends Funding {

	private	String companyName;
	private String categoryName;

	public FundingView() {
		// TODO Auto-generated constructor stub
	}

	public FundingView(int id, int adminId, int memberId, int categoryId, Date regdate, String title, int tAmount,
			String introVideo, String introImg, Date sdate, Date edate, int hit, int state, String companyName, String categoryName) {
		super(id, adminId, memberId, categoryId, regdate, title, tAmount,
				 introVideo, introImg, sdate, edate, hit, state);
		
		this.companyName = companyName;
		this.categoryName = categoryName;
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

	