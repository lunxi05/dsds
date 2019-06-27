package com.blackswan.web.dao;

import java.sql.SQLException;
import java.util.List;

import com.blackswan.web.entity.Notice;
import com.blackswan.web.entity.view.NoticeView;

public interface NoticeDao {
	List<NoticeView> getList() throws ClassNotFoundException, SQLException;
	List<NoticeView> getList(int page) throws ClassNotFoundException, SQLException;
	List<NoticeView> getList(int page, String field, String query) throws ClassNotFoundException, SQLException;

	Notice get(int id) throws ClassNotFoundException, SQLException;
	Notice getPrev(int id) throws ClassNotFoundException, SQLException;
	Notice getNext(int id) throws ClassNotFoundException, SQLException;

	int insert(Notice notice) throws ClassNotFoundException, SQLException;
	int update(Notice notice) throws ClassNotFoundException, SQLException;
	int delete(int id) throws ClassNotFoundException, SQLException;

	int getCount() throws ClassNotFoundException, SQLException;
	int getCount(String field, String query) throws ClassNotFoundException, SQLException;
}
