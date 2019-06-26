package com.blackswan.web.controller.member.mypage;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.blackswan.web.dao.MemberDao;
import com.blackswan.web.dao.oracle.OracleMemberDao;

@WebServlet("/member/mypage2")
public class MypageController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		int id = (int) session.getAttribute("ssid");

		if (session.getAttribute("ssid") == null) {
			resp.sendRedirect("/error.jsp");
			return;
		}
		MemberDao mDao = new OracleMemberDao();
		try {
			req.setAttribute("member", mDao.get(id));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		req.getRequestDispatcher("/WEB-INF/view/member/mypage.jsp").forward(req, resp);

	}
}
