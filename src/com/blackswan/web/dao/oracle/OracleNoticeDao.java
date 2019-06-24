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

import com.blackswan.web.dao.NoticeDao;
import com.blackswan.web.entity.Notice;

public class OracleNoticeDao implements NoticeDao {

	@Override
	public List<NoticeView> getList() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return getList(1, "title", "");
	}

	@Override
	public List<NoticeView> getList(int page) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return getList(page, "title", "");
	}

	@Override
	public List<NoticeView> getList(int page, String field, String query) throws ClassNotFoundException, SQLException {
		List<NoticeView> list = new ArrayList<>();

		int start = 1 + (page - 1) * 10;
		int end = start + 9;

		String sql = "SELECT * FROM NOTICE_VIEW WHERE " + field + " LIKE ? AND NUM BETWEEN ? AND ? ";

		String url = "jdbc:oracle:thin:@192.168.0.16:1521/xepdb1";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, "%" + query + "%");
		st.setInt(2, start);
		st.setInt(3, end);

		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			NoticeView notice = new NoticeView(
					rs.getInt("id"),
					rs.getInt("admin_id"), 
					rs.getInt("division"), 
					rs.getString("title"), 
					rs.getString("content"), 
					rs.getString("attach"), 
					rs.getDate("regdate"),
					rs.getDate("sdate"),
					rs.getDate("edate"),
					rs.getInt("hit"),
					rs.getInt("state")
					);
			list.add(notice);
		}

		rs.close();
		st.close();
		con.close();

		return list;
	}

	@Override
	public Notice get(int id) throws ClassNotFoundException, SQLException {
		Notice notice = null;

		String sql = "select * from notice where id =" + id;

		String url = "jdbc:oracle:thin:@192.168.0.16:1521/xepdb1";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);

		if (rs.next()) {
			notice = new Notice(
					rs.getInt("id"), 
					rs.getInt("admin_id"), 
					rs.getInt("division"), 
					rs.getString("title"), 
					rs.getString("content"), 
					rs.getString("attach"), 
					rs.getDate("regdate"),
					rs.getDate("sdate"), 
					rs.getDate("edate"), 
					rs.getInt("hit"), 
					rs.getInt("state"));

		}

		rs.close();
		st.close();
		con.close();

		return notice;
	}

	@Override
	public Notice getPrev(int id) throws ClassNotFoundException, SQLException {
		Notice notice = null;
		
		String sql = "SELECT * FROM (SELECT * FROM NOTICE_VIEW ORDER BY REGDATE) WHERE REGDATE > "+
				"(SELECT REGDATE FROM NOTICE WHERE ID = '"+id+"')" + "AND ROWNUM = 1";
		
		String url = "jdbc:oracle:thin:@192.168.0.16:1521/xepdb1";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,"\"PRJ\"","1234");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		if(rs.next()) {
		notice = new Notice(
				rs.getInt("id"), 
				rs.getInt("admin_id"), 
				rs.getInt("division"), 
				rs.getString("title"), 
				rs.getString("content"), 
				rs.getString("attach"), 
				rs.getDate("regdate"),
				rs.getDate("sdate"), 
				rs.getDate("edate"), 
				rs.getInt("hit"), 
				rs.getInt("state"));
				
		
		}

		rs.close();
		st.close();
		con.close();
		
		return notice;
	}

	@Override
	public Notice getNext(int id) throws ClassNotFoundException, SQLException {

		Notice notice = null;

		String sql = "SELECT * FROM NOTICE_VIEW WHERE REGDATE < "+
				"(SELECT REGDATE FROM NOTICE WHERE ID = '"+id+"')" + "AND ROWNUM = 1";

		String url = "jdbc:oracle:thin:@192.168.0.16:1521/xepdb1";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);

		if (rs.next()) {
			notice = new Notice(
					rs.getInt("id"), 
					rs.getInt("admin_id"), 
					rs.getInt("division"), 
					rs.getString("title"), 
					rs.getString("content"), 
					rs.getString("attach"), 
					rs.getDate("regdate"),
					rs.getDate("sdate"), 
					rs.getDate("edate"), 
					rs.getInt("hit"), 
					rs.getInt("state"));


		}

		rs.close();
		st.close();
		con.close();

		return notice;
	}

	@Override
	public int insert(Notice notice) throws ClassNotFoundException, SQLException {
		int result = 0;

		String sql = "insert into notice(id, division, title, content) "
				+ "values(noti_seq.nextval,?,?,?)";

		String url = "jdbc:oracle:thin:@192.168.0.16:1521/xepdb1";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");

		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, notice.getDivision());
		st.setString(2, notice.getTitle());
		st.setString(3, notice.getContent());

		result = st.executeUpdate();

		st.close();
		con.close();

		return result;
	}

	@Override
	public int update(Notice notice) throws ClassNotFoundException, SQLException {
		int result = 0;

		String sql = "update notice set division=?, title=?, content=? where id=?";

		String url = "jdbc:oracle:thin:@192.168.0.16:1521/xepdb1";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");

		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, notice.getDivision());
		st.setString(2, notice.getTitle());
		st.setString(3, notice.getContent());
		st.setInt(4, notice.getId());

		result = st.executeUpdate();

		st.close();
		con.close();

		return result;
	}

	@Override
	public int delete(int id) throws ClassNotFoundException, SQLException {
		int result = 0;

		String sql = "delete from notice where id=?";

		String url = "jdbc:oracle:thin:@192.168.0.16:1521/xepdb1";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, "\"PRJ\"", "1234");

		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, id);

		result = st.executeUpdate();

		st.close();
		con.close();

		return result;
	}

}
