package com.blackswan.web.controller.member;

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
import com.blackswan.web.entity.Member;

@WebServlet("/member/login")
public class LoginController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/view/member/login.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email = req.getParameter("email");
		String pw = req.getParameter("pw");
		HttpSession session = req.getSession();
		MemberDao memberDao = new OracleMemberDao();

		try {
			Member member = memberDao.get(email);
			
			System.out.println("error1");

			if (member == null) {
				System.out.println("error2");
				resp.sendRedirect("/blackswan2/error");
			}
			else if (!member.getPw().equals(pw)) {
				System.out.println("error3");
				resp.sendRedirect("/blackswan2/error");
			} else {
				System.out.println("error4");
				session.setAttribute("id", member.getId());

				resp.sendRedirect("/blackswan2/index");

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
