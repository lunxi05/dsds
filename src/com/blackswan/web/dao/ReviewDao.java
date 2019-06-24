package com.blackswan.web.dao;

import java.sql.SQLException;
import java.util.List;

import com.blackswan.web.entity.Review;

public interface ReviewDao {
	
	List<Review> getList() throws ClassNotFoundException, SQLException;	//리뷰리스트
	List<Review> getList(int page) throws ClassNotFoundException, SQLException;	//리뷰리스트(페이지 넘기기)
	List<Review> getList(int page, String field, String query) throws ClassNotFoundException, SQLException;	//리뷰리스트(검색)
	
	Review get(int id) throws ClassNotFoundException, SQLException;	//리뷰 상세보기
	Review getPrev(int id) throws ClassNotFoundException, SQLException;//이전페이지
	Review getNext(int id);//다음페이지
	
	int insert(Review review) throws SQLException, ClassNotFoundException;	//글쓰기
	int update(Review review) throws ClassNotFoundException, SQLException;	//수정
	int delete(int id) throws ClassNotFoundException, SQLException;// 삭제

}
