package com.blackswan.web.dao.oracle;

import java.util.Date;

import com.blackswan.web.entity.Funding;
import com.blackswan.web.entity.Member;

public class FundingView extends Funding {

	private String categoryName;

	public FundingView() {
		// TODO Auto-generated constructor stub
	}

	public FundingView(int id, int adminId, int memberId, int categoryId, Date regdate, String title, int tAmount,
			String introVideo, String introImg, Date sdate, Date edate, int hit, int state, String categoryName) {
		super(id, adminId, memberId, categoryId, regdate, title, tAmount,
				 introVideo, introImg, sdate, edate, hit, state);
		
		this.categoryName = categoryName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	
}

	