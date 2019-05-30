package com.blackswan.web.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;

import com.blackswan.web.dao.oracle.MemberView;
import com.blackswan.web.entity.Member;

public interface MemberDao {
	
	List<MemberView> getList() throws ClassNotFoundException, SQLException;
	List<MemberView> getList(int page) throws ClassNotFoundException, SQLException;
	List<MemberView> getList(int page, String field, String query) throws ClassNotFoundException, SQLException;
	
	Member get(int id);
	
	int insert(Member member);
	int update(Member member);

}
