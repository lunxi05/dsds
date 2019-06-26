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
import com.blackswan.web.entity.FundingView;
import com.blackswan.web.entity.Seller;

public class OracleFundingPriceDao implements FundingPriceDao{

	@Override
	public int getCount() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCount(String field, String query) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<FundingPrice> getList() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FundingPrice> getList(int page) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FundingPrice> getList(int page, String field, String query)
			throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FundingView get(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(FundingPrice fundingprice) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

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
	public int update(FundingPrice fundingprice) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return 0;
	}





}
