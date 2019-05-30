package com.blackswan.web.dao.oracle;

import java.util.Date;

import com.blackswan.web.entity.Notice;

public class NoticeView extends Notice {

	public NoticeView() {
		// TODO Auto-generated constructor stub
	}
	
	

	public NoticeView(int id, String type, String title, String content, String writerId
			, Date regDate, int hit) {
		super(id, type, title, content, writerId, regDate, hit);
		// TODO Auto-generated constructor stub
		
	}



	

}
