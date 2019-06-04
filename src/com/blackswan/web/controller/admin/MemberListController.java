package com.blackswan.web.controller.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.blackswan.web.dao.MemberDao;
import com.blackswan.web.dao.oracle.OracleMemberDao;

@WebServlet("/admin/member/list")
public class MemberListController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		MemberDao memberDao = new OracleMemberDao();
		
		try {
			req.setAttribute("member", memberDao.getList());
		} catch (Exception e) {
			e.printStackTrace();
		}
		  
		req.getRequestDispatcher("/WEB-INF/view/admin/member/list.jsp").forward(req, resp);
		
	}

}
