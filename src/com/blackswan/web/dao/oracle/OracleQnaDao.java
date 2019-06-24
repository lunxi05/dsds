package com.blackswan.web.dao.oracle;

import java.sql.SQLException;
import java.util.List;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

public class OracleQnaDao implements QnaDao {
	
	@Override
	public List<QnaView> getList() throws Exception{
		
	}
	
	@Override
	public List<QnaView> getList(int page) throws Exception {
		
	}
	
	@Override
	public List<QnaView> getList(int page, String field, String query) throws Exception{
		
	}
	@Override
	public Qna get(int id) throws Exception{
		Qna qna = null;
		String sql = "selet * from qna where id=" +id;
		
	}
	
	@Override
	public Qna getPrev(int id) throws Exception{
		
	}

	@Override
	public int insert(Qna qna) throws Exception{
		
	}
	@Override
	public int update(Qna qna) throws Exception{
		
	}
	@Override
	public int delete(int id) throws Exception{
		
	}
	
	@Override
	public int getLastId() throws Exception{
		
	}

	@Override
	public Qna get(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Qna getPrev(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Qna getNext(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Qna get(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Qna getPrev(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Qna getNext(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
