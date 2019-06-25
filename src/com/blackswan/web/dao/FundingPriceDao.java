package com.blackswan.web.dao;

import java.sql.SQLException;
import java.util.List;

import com.blackswan.web.dao.oracle.FundingView;
import com.blackswan.web.dao.oracle.NoticeView;
import com.blackswan.web.entity.Funding;
import com.blackswan.web.entity.FundingPrice;
import com.blackswan.web.entity.Notice;
import com.blackswan.web.entity.Seller;

public interface FundingPriceDao {
	
	int getCount() throws ClassNotFoundException, SQLException;
	int getCount(String field, String query) throws ClassNotFoundException, SQLException;
	
	List<FundingPrice> getList() throws ClassNotFoundException, SQLException;
	List<FundingPrice> getList(int page) throws ClassNotFoundException, SQLException;
	List<FundingPrice> getList(int page, String field, String query) throws ClassNotFoundException, SQLException;
	
	FundingView get(int id) throws ClassNotFoundException, SQLException;
	
	
	
	int insert(FundingPrice fundingprice) throws ClassNotFoundException, SQLException;
	int update(FundingPrice fundingprice) throws ClassNotFoundException, SQLException;
	int delete(int id) throws ClassNotFoundException, SQLException;
}
