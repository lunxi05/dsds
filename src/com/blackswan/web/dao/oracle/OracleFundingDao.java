package com.blackswan.web.dao.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.blackswan.web.dao.FundingDao;
import com.blackswan.web.entity.Funding;
import com.blackswan.web.entity.Notice;
import com.blackswan.web.entity.Review;

public class OracleFundingDao implements FundingDao{

	@Override
	public List<FundingView> getList() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return getList(1,"title","");
	}

	@Override
	public List<FundingView> getList(int page) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		return getList(page,"title","");
	}

	@Override
	public List<FundingView> getList(int page, String field, String query) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		List<FundingView> list = new ArrayList<>();
		
		int start =(page-1)*10+1;
		int end =page+10;
		
		String sql ="SELECT * FROM FUNDING_VIEW WHERE "+field+" LIKE ? AND NUM BETWEEN ? AND ?";

		
		//String url = "jdbc:oracle:thin:@192.168.0.16:1521/xepdb1";
		String url = "jdbc:oracle:thin:@222.111.247.47:1522/xepdb1";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");
		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, "%"+query+"%");
		st.setInt(2, start);
		st.setInt(3, end);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			FundingView funding = new FundingView(
					 rs.getInt("num"),
					 rs.getInt("id"),
					 0,
					 0,
					 0,
					 rs.getDate("regdate"),
					 rs.getString("title"),
					 rs.getInt("t_amount"),
					 rs.getString("intro_img"),
					 rs.getDate("s_date"),
					 rs.getDate("e_date"),
					 rs.getInt("hit"),
					 rs.getInt("state"),
					 rs.getString("company_name"),
					 rs.getString("name"),
					 rs.getInt("pay"),
					 rs.getInt("part_rate")
					);
					list.add(funding);
		}
		
		rs.close();
		st.close();
		con.close();
		
		return list;
	}

	@Override
	public FundingView get(int id) throws ClassNotFoundException, SQLException {
		
		FundingView funding = null;
		
		String sql = "SELECT * FROM FUNDING WHERE ID="+id;
		
		String url = "jdbc:oracle:thin:@222.111.247.47:1522/xepdb1";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		if(rs.next()) {
			funding = new FundingView(
					 rs.getInt("num"),
					 rs.getInt("id"),
					 0,
					 0,
					 0,
					 rs.getDate("regdate"),
					 rs.getString("title"),
					 rs.getInt("t_amount"),
					 rs.getString("intro_img"),
					 rs.getDate("s_date"),
					 rs.getDate("e_date"),
					 rs.getInt("hit"),
					 rs.getInt("state"),
					 rs.getString("company_name"),
					 rs.getString("name"),
					 rs.getInt("pay"),
					 rs.getInt("part_rate")
					);
		}
		
		
		rs.close();
		st.close();
		con.close();		
		
		return funding;
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

	@Override
	public int getCount() throws ClassNotFoundException, SQLException {
		
		return getCount("title", "");
	}
	
	@Override
	public int getCount(String field, String query) throws ClassNotFoundException, SQLException {
		
		int count = 0;
		
		String sql = "SELECT COUNT(ID) COUNT FROM FUNDING WHERE " + field + " LIKE ?";

		String url = "jdbc:oracle:thin:@222.111.247.47:1522/xepdb1";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");
		PreparedStatement st = con.prepareStatement(sql);

		st.setString(1, "%" + query + "%");		
		
		ResultSet rs = st.executeQuery();
		
		while (rs.next())
			count = rs.getInt("count");
		
		rs.close();
		st.close();
		con.close();

		return count;
	}

}
