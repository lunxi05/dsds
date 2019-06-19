package com.blackswan.web.dao;

import java.sql.SQLException;
import java.util.List;

import com.blackswan.web.dao.oracle.FundingView;
import com.blackswan.web.dao.oracle.NoticeView;
import com.blackswan.web.entity.Funding;
import com.blackswan.web.entity.Notice;

public interface FundingDao {
	List<FundingView> getList() throws ClassNotFoundException, SQLException;
	List<FundingView> getList(int page) throws ClassNotFoundException, SQLException;
	List<FundingView> getList(int page, String field, String query) throws ClassNotFoundException, SQLException;
	
	Funding get(int id) throws ClassNotFoundException, SQLException;
	
	
	int insert(Funding funding) throws ClassNotFoundException, SQLException;
	int update(Funding funding) throws ClassNotFoundException, SQLException;
	int delete(int id) throws ClassNotFoundException, SQLException;
}
