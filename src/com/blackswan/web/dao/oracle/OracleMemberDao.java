package com.blackswan.web.dao.oracle;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;

import com.blackswan.web.dao.MemberDao;
import com.blackswan.web.entity.Member;

public class OracleMemberDao implements MemberDao {

	@Override
	public List<MemberView> getList() throws ClassNotFoundException, SQLException {

		return getList(1, "id", "");
	}

	@Override
	public List<MemberView> getList(int page) throws ClassNotFoundException, SQLException {

		return getList(page, "id", "");
	}

	@Override
	public List<MemberView> getList(int page, String field, String query) throws ClassNotFoundException, SQLException {
		
		List<MemberView> list = new ArrayList<>();
		
		int start = 1+(page-1)*10;
		int end = start+9;
		
		String sql = "SELECT * FROM MEMBER_VIEW WHERE " + field + " LIKE ? AND NUM BETWEEN ? AND ?";
		
		String url = "jdbc:oracle:thin:@222.111.247.47:1522/xepdb1";
//		String url = "jdbc:oracle:thin:@168.192.0.16:1521/xepdb1";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,"\"PRJ\"","1234");
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, "%"+query+"%");
		st.setInt(2, start);
		st.setInt(3, end);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			MemberView member = new MemberView(
					rs.getInt("num"),
					rs.getInt("id"),
					rs.getInt("black"),
					rs.getString("email"),
					rs.getString("name"),
					rs.getDate("regdate"),
					rs.getString("condition")
					);
			list.add(member);
		}
		
		rs.close();
		st.close();
		con.close();

		return list;
	}

	@Override
	public Member get(int id) {

		return null;
	}

	@Override
	public int insert(Member member) {

		return 0;
	}

	@Override
	public int update(Member member) {

		return 0;
	}

}
