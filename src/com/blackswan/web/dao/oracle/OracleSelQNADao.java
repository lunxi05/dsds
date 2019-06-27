package com.blackswan.web.dao.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.blackswan.web.dao.BuyingDao;
import com.blackswan.web.dao.SelQnaDao;
import com.blackswan.web.entity.Buying;
import com.blackswan.web.entity.SelEvent;
import com.blackswan.web.entity.SelQNA;
import com.blackswan.web.entity.view.ReviewView;

public class OracleSelQNADao implements SelQnaDao {

	@Override
	public List<SelQNA> getList(int fid) throws ClassNotFoundException, SQLException {
		List<SelQNA> list = new ArrayList<>();
			
			String sql = " SELECT id, member_id,content,title,to_char(regdate) regdate,reply,repdate,answer_id,funding_id FROM qna where funding_id="+fid;
			String url = "jdbc:oracle:thin:@192.168.0.16:1521/xepdb1";
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");
			Statement st = con.createStatement();
			
			
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				SelQNA review = new SelQNA(
										rs.getInt("id"), 
										rs.getInt("member_id"), 
										rs.getString("content"), 
										rs.getString("title"), 
										rs.getString("regdate"), 
										rs.getString("reply"), 
										rs.getString("repdate"), 
										rs.getInt("answer_id"), 
										rs.getInt("funding_id"));
										
						list.add(review);
			}
			
						
			rs.close();
			st.close();
			con.close();
			
			return list;


	}
	public int insert(SelQNA selQNA) throws Exception {
		int result = 0;
		String sql = " INSERT INTO qna ( content,title,funding_id) VALUES (?,?,?)"  ;
		
		String url = "jdbc:oracle:thin:@222.111.247.47:1522/xepdb1";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");
		PreparedStatement st = con.prepareStatement(sql);
		
	
		st.setString(1, selQNA.getContent());
		st.setString(2, selQNA.getTitle());
		st.setInt(3,selQNA.getFundingid());
		
		result = st.executeUpdate();
	
		st.close();
		con.close();
			
		
		return result;	

			
	}
}
