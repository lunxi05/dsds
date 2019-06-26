package com.blackswan.web.dao.oracle;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.blackswan.web.dao.QnaDao;
import com.blackswan.web.entity.Admin_Qna_View;
import com.blackswan.web.entity.Notice;
import com.blackswan.web.entity.Qna;
import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OracleQnaDao implements QnaDao {

	@Override
	public List<Admin_Qna_View> getList() throws ClassNotFoundException, SQLException {
		return getList(1, "title", "");
	}

	@Override
	public List<Admin_Qna_View> getList(int page) throws ClassNotFoundException, SQLException {
		return getList(page, "title", "");
	}

	@Override
	public List<Admin_Qna_View> getList(int page, String field, String query) throws ClassNotFoundException, SQLException {
		List<Admin_Qna_View> list = new ArrayList<>();

		int start = 1 + (page - 1) * 10;
		int end = start + 9;

		String sql = "SELECT * FROM ADMIN_QNA_VIEW WHERE " + field + " LIKE ? AND NUM BETWEEN ? AND ?";
		String url = "jdbc:oracle:thin:@192.168.0.16:1521/xepdb1";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection cnc = DriverManager.getConnection(url, "\"PRJ\"", "1234");
		PreparedStatement st = cnc.prepareStatement(sql);
		st.setString(1, "%" + query + "%");
		st.setInt(2, start);
		st.setInt(3, end);

		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			Admin_Qna_View qna = new Admin_Qna_View(rs.getInt("num"), rs.getString("name"), rs.getInt("admin_id"), rs.getString("content"), rs.getInt("id"), rs.getString("member_id"), rs.getDate("regdate"), rs.getString("reply"), rs.getDate("r_date"),
					rs.getInt("secretnum"),rs.getInt("state"), rs.getString("title"));
			list.add(qna);

		}

		rs.close();
		st.close();
		cnc.close();

		return list;

	}

	@Override
	public Qna get(int id) throws ClassNotFoundException, SQLException {
		Qna qna = null;
		String sql = "selet * from qna where id=" + id;
		String url = "jdbc:oracle:thin:@192.168.0.16:1521/xepdb1";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection cnc = DriverManager.getConnection(url, "\"PRJ\"", "1234");
		Statement st = cnc.createStatement();
		ResultSet rs = st.executeQuery(sql);
		if (rs.next()) {
			qna = new Admin_Qna_View(rs.getInt("num"), rs.getString("name"), rs.getInt("admin_id"), rs.getString("content"), rs.getInt("id"), rs.getString("member_id"), rs.getDate("regdate"), rs.getString("reply"), rs.getDate("r_date"),
					rs.getInt("secretnum"),rs.getInt("state"), rs.getString("title"));

		}

		rs.close();
		st.close();
		cnc.close();

		return qna;
	}

	
	@Override
	public int insert(Qna qna) throws ClassNotFoundException, SQLException {
		int result = 0;

		String sql = "insert into qna(id, member_id, title, content)" + "values(aqna_seq.nextval,?,?,?)";
		String url = "jdbc:oracle:thin:@192.168.0.16:1521/xepdb1";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection cnc = DriverManager.getConnection(url, "\"PRJ\"", "1234");

		PreparedStatement st = cnc.prepareStatement(sql);
		st.setInt(1, qna.getId());
		st.setString(2, qna.getTitle());
		st.setString(3, qna.getContent());

		result = st.executeUpdate();

		st.close();
		cnc.close();

		return result;
	}


	@Override
	public int delete(int id) throws ClassNotFoundException, SQLException {
		int result = 0;
		String sql = "delete from qna where id=?";

		String url = "jdbc:oracle:thin:@192.168.0.16:1521/xepdb1";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection cnc = DriverManager.getConnection(url, "\"PRJ\"", "1234");

		PreparedStatement st = cnc.prepareStatement(sql);
		st.setInt(1, id);

		result = st.executeUpdate();

		st.close();
		cnc.close();

		return result;

	}
}
