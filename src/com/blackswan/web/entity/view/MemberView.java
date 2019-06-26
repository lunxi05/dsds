package com.blackswan.web.entity.view;

import java.util.Date;

import com.blackswan.web.entity.Member;

public class MemberView extends Member {

	private int num;
	private int mCount;
	private int bCount;

	public MemberView() {

	}

	public MemberView(int num, int id, String email, String name, String pw, int phone, String profile, String eventAgree,
			int adminId, String address, int addressNum, Date regdate, int mCount, int bCount) {
		super(id, email, name, pw, phone, profile, eventAgree, adminId, address, addressNum, regdate);

		this.num = num;
		this.mCount = mCount;
		this.bCount = bCount;
	}

	public void setbCount(int bCount) {
		this.bCount = bCount;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getmCount() {
		return mCount;
	}

	public void setmCount(int mCount) {
		this.mCount = mCount;
	}

	public int getbCount() {
		return bCount;
	}

}
