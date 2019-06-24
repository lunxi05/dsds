package com.blackswan.web.dao.oracle;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;

import com.blackswan.web.dao.MemberDao;
import com.blackswan.web.entity.Member;

public class OracleMemberDao implements MemberDao {

	public int getCount() throws ClassNotFoundException, SQLException {
		return getCount("name", "");
	}

	@Override
	public int getCount(String field, String query) throws ClassNotFoundException, SQLException {

		int count = 0;

		String sql = "SELECT COUNT(ID) COUNT FROM MEMBER WHERE " + field + " LIKE ?";

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

	@Override
	public List<MemberView> getList() throws ClassNotFoundException, SQLException {

		return getList(1, "name", "");
	}

	@Override
	public List<MemberView> getList(int page) throws ClassNotFoundException, SQLException {

		return getList(page, "name", "");
	}

	@Override
	public List<MemberView> getList(int page, String field, String query) throws ClassNotFoundException, SQLException {

		List<MemberView> list = new ArrayList<>();

		int start = 1 + (page - 1) * 10;
		int end = start + 9;

		String sql = "SELECT * FROM MEMBER_VIEW WHERE " + field + " LIKE ? AND NUM BETWEEN ? AND ? ORDER BY ID DESC";

		String url = "jdbc:oracle:thin:@222.111.247.47:1522/xepdb1";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, "%" + query + "%");
		st.setInt(2, start);
		st.setInt(3, end);

		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			MemberView member = new MemberView(rs.getInt("num"), rs.getInt("id"), rs.getString("email"),
					rs.getString("name"), "", rs.getInt("phone"), rs.getString("profile"),
					rs.getInt("event_check"), 1, rs.getString("address"), rs.getInt("address_num"),
					rs.getDate("regdate"));
			list.add(member);
		}
		
		

		rs.close();
		st.close();
		con.close();

		return list;
	}

	@Override
	public Member get(int id) throws ClassNotFoundException, SQLException {

		Member member = null;

		String sql = "SELECT * FROM MEMBER WHERE ID=" + id; // 조인해서 쓴 글 수, 참여한 펀딩 수 가져오기
		String url = "jdbc:oracle:thin:@222.111.247.47:1522/xepdb1";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);

		while (rs.next()) {
			member = new MemberView(rs.getInt("num"), rs.getInt("id"), rs.getString("email"), rs.getString("name"), "",
					rs.getInt("phone"), rs.getString("profile"), rs.getInt("event_check"), 1, rs.getString("address"),
					rs.getInt("address_number"), rs.getDate("regdate"));
		}

		rs.close();
		st.close();
		con.close();

		return member;
	}

	@Override
	public int insert(Member member) throws ClassNotFoundException, SQLException {
		
		int result = 0;

		String sql = "insert into member(id, email, name, pw, phone) "
				+ "values(noti_seq.nextval,?,?,?,?)";

		String url = "jdbc:oracle:thin:@192.168.0.16:1521/xepdb1";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");

		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, (member.getEmail());
		st.setString(2, ());
		st.setString(3, ());
		st.setString(4, ());

		result = st.executeUpdate();

		st.close();
		con.close();

		return result;
	}

	@Override
	public int update(Member member) throws ClassNotFoundException, SQLException {

		return 0;
	}

}
