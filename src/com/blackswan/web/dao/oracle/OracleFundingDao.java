package com.blackswan.web.dao.oracle;

import java.sql.SQLException;
import java.util.List;

import com.blackswan.web.dao.FundingDao;
import com.blackswan.web.entity.Funding;
import com.blackswan.web.entity.Notice;

public class OracleFundingDao implements FundingDao{

	@Override
	public List<Funding> getList() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Funding> getList(int page) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Funding> getList(int page, String field, String query) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Notice get(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Notice getPrev(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Notice getNext(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Funding funding) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String sql = "insert into funding(ID, ADMIN_ID, MEMBER_ID, CATEGORY_ID, REGDATE, " 
				      +" TITLE, T_AMOUNT, INTRO_VIDEO, INTRO_IMG, S_DATE, E_DATE, HIT, STATE)"
				+ "values(fun_seq.nextval,?,?,?,,'admin')";

		
		
		return 0;
	}

	@Override
	public int update(Funding funding) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
