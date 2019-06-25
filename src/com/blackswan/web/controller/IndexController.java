package com.blackswan.web.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.blackswan.web.dao.FundingDao;
import com.blackswan.web.dao.MemberDao;
import com.blackswan.web.dao.oracle.OracleFundingDao;
import com.blackswan.web.dao.oracle.OracleMemberDao;
import com.blackswan.web.entity.Member;

@WebServlet("/index")
public class IndexController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		FundingDao fundingDao = new OracleFundingDao();
		
		try {
			req.setAttribute("iflist", fundingDao.getList());
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		if (session.getAttribute("ssid") != null) {
			int sId = (int) session.getAttribute("ssid");

			MemberDao memberDao = new OracleMemberDao();

			try {
				if (sId != 0)
					req.setAttribute("hmember", memberDao.get(sId));

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		req.getRequestDispatcher("/WEB-INF/view/index.jsp").forward(req, resp);

	}

}