package com.blackswan.web.dao;

import java.sql.SQLException;
import java.util.List;

import com.blackswan.web.dao.oracle.NoticeView;
import com.blackswan.web.entity.Funding;
import com.blackswan.web.entity.Notice;

public interface FundingDao {
	List<Funding> getList() throws ClassNotFoundException, SQLException;
	List<Funding> getList(int page) throws ClassNotFoundException, SQLException;
	List<Funding> getList(int page, String field, String query) throws ClassNotFoundException, SQLException;
	
	Funding get(int id) throws ClassNotFoundException, SQLException;
	
	
	int insert(Funding funding) throws ClassNotFoundException, SQLException;
	int update(Funding funding) throws ClassNotFoundException, SQLException;
	int delete(int id) throws ClassNotFoundException, SQLException;
}
