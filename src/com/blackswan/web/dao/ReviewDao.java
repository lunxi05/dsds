package com.blackswan.web.dao;

import java.sql.SQLException;
import java.util.List;

import com.blackswan.web.entity.view.ReviewView;

public interface ReviewDao {
//	
//	List<ReviewView> getList() throws ClassNotFoundException, SQLException;	//리뷰리스트
//	List<ReviewView> getList(int page) throws ClassNotFoundException, SQLException;	//리뷰리스트(페이지 넘기기)
	List<ReviewView> getList(int page, int id) throws ClassNotFoundException, SQLException;	//리뷰리스트(검색)
	
	

}
