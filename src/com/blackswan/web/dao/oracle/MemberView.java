package com.blackswan.web.dao.oracle;

import java.util.Date;
import com.blackswan.web.entity.Member;

public class MemberView extends Member {

	private int num;
	
	public MemberView() {
		
	}
	
	public MemberView(int num, int id, String email, String name, String pw, int phone, String profile,
			String blackReason, int eventCheck, int adminId, String address, int addressNumber, Date regdate, String state) {
		super(id, email, name, pw, phone, profile, blackReason, eventCheck, adminId, address, addressNumber, regdate, state);
		
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
