package com.blackswan.web.dao.oracle;

import java.util.Date;
import com.blackswan.web.entity.Member;

public class MemberView extends Member {

	private int num;
	
	public MemberView() {
		
	}
	
	public MemberView(int num, int id, int black, String email, String name, Date regdate, String condition) {
		super(id, black, email, name, regdate, condition);
		
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
