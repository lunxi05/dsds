package com.blackswan.web.dao;

import java.sql.SQLException;
import java.util.List;

import com.blackswan.web.entity.Qna;
import com.blackswan.web.entity.view.AdminQnaView;

public interface QnaDao {
	List<AdminQnaView> getList() throws ClassNotFoundException, SQLException;
	List<AdminQnaView> getList(int page) throws ClassNotFoundException, SQLException;
	List<AdminQnaView> getList(int page, String field, String query) throws ClassNotFoundException, SQLException;
	
	Qna get(int id) throws ClassNotFoundException, SQLException;

	
	
	int insert(Qna qna) throws ClassNotFoundException, SQLException;
	
	int delete(int id) throws ClassNotFoundException, SQLException;
}
