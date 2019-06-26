package com.blackswan.web.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;

import com.blackswan.web.entity.Member;
import com.blackswan.web.entity.view.MemberView;

public interface MemberDao {
	
	int getCount() throws ClassNotFoundException, SQLException;
	int getCount(String field, String query) throws ClassNotFoundException, SQLException;
	
	List<MemberView> getList() throws ClassNotFoundException, SQLException;
	List<MemberView> getList(int page) throws ClassNotFoundException, SQLException;
	List<MemberView> getList(int page, String field, String query) throws ClassNotFoundException, SQLException;
	
	Member get(String email) throws ClassNotFoundException, SQLException;
	Member get(int id) throws ClassNotFoundException, SQLException;
	
	int insert(Member member) throws ClassNotFoundException, SQLException;
	int update(Member member) throws ClassNotFoundException, SQLException;

}
