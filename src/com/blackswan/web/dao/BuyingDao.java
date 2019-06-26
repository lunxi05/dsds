package com.blackswan.web.dao;

import java.util.List;

import com.blackswan.web.entity.Buying;

public interface BuyingDao {
	
	List<Buying> getList();
	
	int insert(Buying buying);
	int delete(Buying buying);
	
	int getCount(int id);
	int getSum(int id);
	
}
