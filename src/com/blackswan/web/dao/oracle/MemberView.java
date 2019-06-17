package com.blackswan.web.dao.oracle;

import java.util.Date;
import com.blackswan.web.entity.Member;

public class MemberView extends Member {

	private int num;

	public MemberView() {

	}

	public MemberView(int num, int id, String email, String name, String pw, int phone, String profile, int eventCheck,
			int adminId, String address, int addressNum, Date regdate) {
		super(id, email, name, pw, phone, profile, eventCheck, adminId, address, addressNum, regdate);

		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

}
