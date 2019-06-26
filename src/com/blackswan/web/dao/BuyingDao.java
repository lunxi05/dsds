package com.blackswan.web.dao;

import java.sql.SQLException;
import java.util.List;

import com.blackswan.web.entity.Buying;

public interface BuyingDao {
	
	List<Buying> getList(int id) throws ClassNotFoundException, SQLException ;
	
	int insert(Buying buying) throws ClassNotFoundException, SQLException ;
	int delete(Buying buying) throws ClassNotFoundException, SQLException ;
	
	int getCount(int id) throws ClassNotFoundException, SQLException ;
	int getSum(int id) throws ClassNotFoundException, SQLException ;
	
}
