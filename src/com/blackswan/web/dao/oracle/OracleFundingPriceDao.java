package com.blackswan.web.dao.oracle;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.blackswan.web.dao.FundingDao;
import com.blackswan.web.dao.FundingPriceDao;
import com.blackswan.web.dao.SellerDao;
import com.blackswan.web.entity.Funding;
import com.blackswan.web.entity.FundingPrice;
import com.blackswan.web.entity.Seller;
import com.blackswan.web.entity.view.FundingView;

public class OracleFundingPriceDao implements FundingPriceDao{

	@Override
	public List<FundingPrice> getList(int id) throws ClassNotFoundException, SQLException {
		
		List<FundingPrice> list = new ArrayList<>();
		
		String sql = "SELECT * FROM FUN_PRICE WHERE ID="+id+" ORDER BY R_PRICE";
		
		String url = "jdbc:oracle:thin:@222.111.247.47:1522/xepdb1";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			FundingPrice fundingPrice = new FundingPrice(
					rs.getInt("id"),
					rs.getInt("r_price"),
					rs.getString("r_content")
					);
			list.add(fundingPrice);
		}
		       
		
		
		
		
		rs.close();
		st.close();
		con.close();
		
		return list;
	}

	@Override
	public int insert(FundingPrice fundingprice) throws ClassNotFoundException, SQLException {

		int result = 0;

		String sql = "insert into fun_price(id, r_price, r_content)"
				+ "values(?, ?, ?)";

		String url = "jdbc:oracle:thin:@222.111.247.47:1522/xepdb1";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");

		PreparedStatement st = con.prepareStatement(sql); 
		
		st.setInt(1, fundingprice.getId());
		st.setInt(2, fundingprice.getrPrice());
		st.setString(3, fundingprice.getrContent());

		result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}

	@Override
	public int getLastId() throws ClassNotFoundException, SQLException {

		String sql = "select id from (select * from funding order by regdate desc) where rownum = 1 ";
		String url = "jdbc:oracle:thin:@222.111.247.47:1522/xepdb1";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		int id=-1;
		
		if(rs.next()) {
			id=rs.getInt("id");
		}
		
		rs.close();
		st.close();
		con.close();
		
		return id;
	}

}
