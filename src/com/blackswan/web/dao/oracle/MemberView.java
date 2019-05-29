package com.blackswan.web.dao.oracle;

import java.util.Date;

import com.blackswan.web.entity.Member;

public class MemberView extends Member {

	private int rnum;

	public MemberView(int rnum, int num, int black, String email, String name, Date regdate, String condition) {
		super(num, black, email, name, regdate, condition);

		this.rnum = rnum;
	}

	public int getRnum() {
		return rnum;
	}

	public void setRnum(int rnum) {
		this.rnum = rnum;
	}
	

}
