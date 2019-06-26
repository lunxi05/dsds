package com.blackswan.web.dao.oracle;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.blackswan.web.dao.BuyingDao;
import com.blackswan.web.entity.Buying;

public class OracleBuyingDao implements BuyingDao {

	@Override
	public List<Buying> getList(int id) throws ClassNotFoundException, SQLException {

		List<Buying> list = new ArrayList<Buying>();

		String sql = "SELECT * FROM BUYING WHERE ID=" + id;

		String url = "jdbc:oracle:thin:@222.111.247.47:1522/xepdb1";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);

		while (rs.next()) {
			Buying buying = new Buying(rs.getInt("id"), rs.getInt("fundingId"), rs.getInt("memberId"),
					rs.getDate("paydate"), rs.getInt("payPr"), 
					rs.getString("req"), rs.getInt("state"));
			list.add(buying);
		}

		return list;
	}

	@Override
	public int insert(Buying buying) throws ClassNotFoundException, SQLException {

		return 0;
	}

	@Override
	public int delete(Buying buying) throws ClassNotFoundException, SQLException {

		return 0;
	}


//	@Override
//	public int getCount(int id) throws ClassNotFoundException, SQLException {
//		
//		int count = 0;
//		
//		String sql = "select sum(quantity) from buying where funding_id="+id+" and pay_pr=";
//		
//		String url = "jdbc:oracle:thin:@222.111.247.47:1522/xepdb1";
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");
//		Statement st = con.createStatement();
//		ResultSet rs = st.executeQuery(sql);		
//		
//		return count;
//	}

	@Override
	public int getSum(int id) throws ClassNotFoundException, SQLException {

		return 0;
	}


	@Override
	public int getCount(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
