package com.blackswan.web.controller.funding;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.blackswan.web.dao.FundingDao;
import com.blackswan.web.dao.NoticeDao;
import com.blackswan.web.dao.oracle.OracleFundingDao;
import com.blackswan.web.dao.oracle.OracleNoticeDao;

@WebServlet("/funding/list")
public class ListController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		FundingDao fundingDao = new OracleFundingDao();
		
		try {
			request.setAttribute("list", fundingDao.getList());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("/WEB-INF/view/funding/list.jsp").forward(request, response);
	}

}