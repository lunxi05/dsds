package com.blackswan.web.controller.admin.member;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.blackswan.web.dao.MemberDao;
import com.blackswan.web.dao.oracle.OracleMemberDao;
import com.blackswan.web.entity.Member;
import com.blackswan.web.entity.view.MemberView;


@WebServlet("/admin/member/list-ajax")
public class ListAjaxController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int page = 1;
		String p_ = req.getParameter("p");
		if (p_ != null && !p_.equals(""))
			page = Integer.parseInt(p_);

		int count = 0;

		Cookie cookie = new Cookie("count", String.valueOf(count));
		cookie.setMaxAge(1000 * 60 * 60 * 24 * 7); // n초동안 쿠키를 저장함, 1000=1초, 파일로 저장됨
		cookie.setPath("/Member/");
		resp.addCookie(cookie);

		MemberDao MemberDao = new OracleMemberDao();
		List<MemberView> list = null;

		try {
			list = MemberDao.getList(page);
		} catch (Exception e) {
			e.printStackTrace();
		}

		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/txt; charset=UTF-8");
		PrintWriter out = resp.getWriter();

		StringBuilder json = new StringBuilder();
		json.append("[");

		for (int i = 0; i < list.size(); i++) {

			Member m = list.get(i);

			json.append("{");
			json.append(String.format("\"id\" : %d, ", m.getId()));
			json.append(String.format("\"email\" : \"%s\", ", m.getEmail()));
			json.append(String.format("\"name\" : \"%s\", ", m.getName()));
			json.append(String.format("\"regDate\" : \"%s\"", m.getRegdate()));
			json.append("}");
			
			if (i < list.size() - 1)
				json.append(", ");

		}

		json.append("]");

		out.write(json.toString());

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.sendRedirect("list");

	}

}