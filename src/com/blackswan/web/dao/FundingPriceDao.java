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
	
	List<FundingPrice> getList(int id) throws ClassNotFoundException, SQLException;
	
	int insert(FundingPrice fundingprice) throws ClassNotFoundException, SQLException;
	int getLastId() throws ClassNotFoundException, SQLException;
}
