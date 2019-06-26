package com.blackswan.web.entity;

import java.util.Date;

public class Admin_Qna_View extends Qna {

	private int num;
	private String name;
	
	public Admin_Qna_View() {
		// TODO Auto-generated constructor stub
	}
	
	public Admin_Qna_View(int num, String name, int admin_id, String content, int id, String member_id, Date regdate, String reply, Date r_date,
			int secretnum, int state, String title) {
		super(admin_id, content, id, member_id, regdate, reply, r_date, secretnum, state, title);
		this.num = num;
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	


}
