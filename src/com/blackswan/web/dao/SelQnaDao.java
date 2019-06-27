package com.blackswan.web.dao;

import java.sql.SQLException;
import java.util.List;

import com.blackswan.web.entity.SelQNA;


public interface SelQnaDao {
	List<SelQNA> getList(int fid) throws ClassNotFoundException, SQLException;
	public int insert(SelQNA selQNA) throws Exception;
}
