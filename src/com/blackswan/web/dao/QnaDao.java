package com.blackswan.web.dao;

import java.sql.SQLException;
import java.util.List;

import com.blackswan.web.entity.Admin_Qna_View;
import com.blackswan.web.entity.Qna;

public interface QnaDao {
	List<Admin_Qna_View> getList() throws ClassNotFoundException, SQLException;
	List<Admin_Qna_View> getList(int page) throws ClassNotFoundException, SQLException;
	List<Admin_Qna_View> getList(int page, String field, String query) throws ClassNotFoundException, SQLException;
	
	Qna get(int id) throws ClassNotFoundException, SQLException;

	
	
	int insert(Qna qna) throws ClassNotFoundException, SQLException;
	
	int delete(int id) throws ClassNotFoundException, SQLException;
}
