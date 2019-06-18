package com.blackswan.web.dao.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.blackswan.web.dao.FundingDao;
import com.blackswan.web.entity.Funding;
import com.blackswan.web.entity.Notice;
import com.blackswan.web.entity.Review;

public class OracleFundingDao implements FundingDao{

	@Override
	public List<Funding> getList() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return getList(1,"title","");
	}

	@Override
	public List<Funding> getList(int page) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		return getList(page,"title","");
	}

	@Override
	public List<Funding> getList(int page, String field, String query) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		List<Funding> list = new ArrayList<>();
		
		int start =(page-1)*10+1;
		int end =page+9;
		
		String sql ="SELECT * FROM funding WHERE "+field+" LIKE ? ";
		
		String url = "jdbc:oracle:thin:@192.168.0.16:1521/xepdb1";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, "%"+query+"%");
//		st.setInt(2, start);
//		st.setInt(3, end);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			Funding funding = new Funding(
					 rs.getInt("id"),
					 rs.getInt("admin_id"),
					 rs.getInt("member_id"),
					 rs.getInt("category_id"),
					 rs.getDate("regDate"),
					 rs.getString("title"),
					 rs.getInt("t_amount"),
					 rs.getString("intro_video"),
					 rs.getString("intro_img"),
					 rs.getDate("s_date"),
					 rs.getDate("e_date"),
					 rs.getInt("hit"),
					 rs.getInt("state")
					);
					list.add(funding);
		}
		
		rs.close();
		st.close();
		con.close();
		
		return list;
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
		/*
		 * String sql =
		 * "insert into funding(ID, ADMIN_ID, MEMBER_ID, CATEGORY_ID, REGDATE, "
		 * +" TITLE, T_AMOUNT, INTRO_VIDEO, INTRO_IMG, S_DATE, E_DATE, HIT, STATE)" +
		 * "values(fun_seq.nextval,?,?,?,,'admin')";
		 */

		
		
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

//	rs.getInt("id"),
//	 rs.getInt("admin_id"),
//	 rs.getInt("member_id"),
//	 rs.getInt("category_id"),
//	 rs.getDate("regDate"),
//	 rs.getString("title"),
//	 rs.getInt("t_amount"),
//	 rs.getString("intro_video"),
//	 rs.getString("intro_img"),
//	 rs.getDate("s_date"),
//	 rs.getDate("e_date"),
//	 rs.getInt("hit"),
//	 rs.getInt("state")
}
