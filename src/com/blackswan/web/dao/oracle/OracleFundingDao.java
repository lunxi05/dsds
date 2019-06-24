package com.blackswan.web.dao.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.blackswan.web.dao.FundingDao;
import com.blackswan.web.entity.Funding;

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
		
		int result = 0;

		String sql = "insert into notice(id, member_id, category_id, title, "
				+ " t_amount, intro_img, s_date, e_date, state)"
				+ "values(fun_seq.nextval, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

		String url = "jdbc:oracle:thin:@222.111.247.47:1522/xepdb1";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");

		PreparedStatement st = con.prepareStatement(sql); // preparedStatement : 실행 전에 statement를 준비, prepare로 준비할 경우
															// st.executeUpdate에 sql 적지 않기
		st.setInt(1, funding.getId());
		st.setInt(2, funding.getMemberId());
		st.setInt(3, funding.getCategoryId());
		st.setString(4, funding.getTitle());
		st.setInt(5, funding.gettAmount());
		st.setString(6, funding.getIntroImg());
		st.setDate(7, funding.getSdate());
		st.setDate(8, funding.getEdate());
		st.setInt(9, funding.getState());

	
		result = st.executeUpdate();

		st.close();
		con.close();

		return result;
		 

		
		
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
