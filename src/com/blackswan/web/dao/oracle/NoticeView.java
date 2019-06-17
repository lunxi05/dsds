package com.blackswan.web.dao.oracle;

import java.util.Date;

import com.blackswan.web.entity.Notice;

public class NoticeView extends Notice {

	public NoticeView() {
		// TODO Auto-generated constructor stub
	}
	
	
	public NoticeView(int id, int adminId, int division, String title, String content, String attach, Date regdate,
			Date sdate, Date edate, int hit, int state) {
		super(id, adminId, division, title, content, attach, regdate, sdate, edate, hit, state);
		// TODO Auto-generated constructor stub
		
	}



	

}
