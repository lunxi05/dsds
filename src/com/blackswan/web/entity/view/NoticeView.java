package com.blackswan.web.entity.view;

import java.util.Date;

import com.blackswan.web.entity.Notice;

public class NoticeView extends Notice {

	private int num;

	public NoticeView(int num, int id, int adminId, int division, String title, String content, String attach,
			Date regdate, Date sdate, Date edate, int hit, int state) {
		super(id, adminId, division, title, content, attach, regdate, sdate, edate, hit, state);
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
