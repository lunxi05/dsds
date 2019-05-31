package com.blackswan.web.dao.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.blackswan.web.dao.ReviewDao;
import com.blackswan.web.entity.Review;
import com.newlecture.web.entity.Notice;


public class OracleReviewDao implements ReviewDao {

	@Override
	public List<Review> getList() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return getList(1,"title","");
	}
	
	@Override
	public List<Review> getList(int page) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return getList(page,"title","");
	}
	
	@Override
	public List<Review> getList(int page, String field, String query) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		List<Review> list = new ArrayList<>();
		
		int start =(page-1)*10+1;
		int end =page+9;
		
		String sql = "select * from review_view " +" where "+ field + " Like ? AND NUM BETWEEN ? AND ?";
		String url = "jdbc:oracle:thin:@192.168.0.16:1521/xepdb1";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, "%"+query+"%");
		st.setInt(2, start);
		st.setInt(3, end);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			Review review = new Review(
					 rs.getInt("id")
					,rs.getString("title")
					,rs.getString("writer_id")
					,rs.getString("content")
					,rs.getDate("regDate")
					);
					list.add(review);
		}
		
					
		rs.close();
		st.close();
		con.close();
		
		return list;
	}

	@Override
	public Review get(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Review review = null;
		
		String sql=" select * from review_view where id= "+id;
		String url = "jdbc:oracle:thin:@192.168.0.16:1521/xepdb1";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(sql);
		
		if(rs.next()) {
			review = new Review(
					 rs.getInt("id")
						,rs.getString("title")
						,rs.getString("writer_id")
						,rs.getString("content")
						,rs.getDate("regDate")
						);
		}
		
		rs.close();
		st.close();
		con.close();
		
		return review;
	}

	@Override
	public Review getPrev(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Review review =null;
		String sql = " select * from review_view ";
		String url = "jdbc:oracle:thin:@192.168.0.16:1521/xepdb1";
		
		Class.forName("oracle.jdbc.driver.OracleDriver"); //드라이버 로드
		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");//
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		if(rs.next()) {
			review = new Review(
					rs.getInt("id")
					,rs.getString("title")
					,rs.getString("writer_id")
					,rs.getString("content")
					,rs.getDate("regDate")
					);
		}
		
		rs.close();
		st.close();
		con.close();
		
		return review;
	}

	@Override
	public Review getNext(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Review review) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		int result = 0;
		
		String sql =" insert into \"review\"(id, title, writer_id, content) values(review_seq.nextval,?,'jun',?) ";
		String url = "jdbc:oracle:thin:@192.168.0.16:1521/xepdb1";
		
		Class.forName("oracle.jdbc.driver.OracleDriver"); //드라이버 로드
		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");//
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1,  review.getTitle());
		st.setString(2, review.getContent());
		
		result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}

	@Override
	public int update(Review review) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int result =0;
		
		String sql =" update \"review\" set title=?, content=? where id=? ";
		String url = "jdbc:oracle:thin:@192.168.0.16:1521/xepdb1";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1,  review.getTitle());
		st.setString(2, review.getContent());
		st.setInt(3,  review.getId());
		
		result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}

	@Override
	public int delete(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int result =0;
		
		String sql =" delete from \"review\" where id=? ";
		String url = "jdbc:oracle:thin:@192.168.0.16:1521/xepdb1";
		
		Class.forName("oracle.jdbc.driver.OracleDriver"); //드라이버 로드
		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");//
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, id);
		                                                                                                                                 
		
		result = st.executeUpdate();
		
		st.close();
		con.close();
		
		return result;
	}
	
	
}
