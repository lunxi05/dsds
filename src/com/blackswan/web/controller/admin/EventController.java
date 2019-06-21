package com.blackswan.web.controller.admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.blackswan.web.dao.SelEventDao;
import com.blackswan.web.dao.oracle.OracleSelEventDao;
import com.blackswan.web.entity.SelEvent;
import com.blackswan.web.entity.SelEventView;

@WebServlet("/view/admin/event")
public class EventController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int page = 1;
		String p = req.getParameter("page");
		
		if(p!=null && !p.equals(""))
			page =Integer.parseInt(p);
		
		
		SelEventDao sDao = new OracleSelEventDao();
		List<SelEventView> list = new ArrayList<>();
		try {
			list = sDao.getList(page);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		req.setAttribute("event", list);
		req.getRequestDispatcher("/WEB-INF/view/admin/event.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		SelEventDao dao = new OracleSelEventDao();
		
	
		try {
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		req.getRequestDispatcher("/WEB-INF/view/admin/event.jsp").forward(req, resp);
	}
}
