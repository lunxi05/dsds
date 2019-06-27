package com.blackswan.web.controller.member.qna;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.blackswan.web.dao.QnaDao;
import com.blackswan.web.dao.SelQnaDao;
import com.blackswan.web.dao.oracle.OracleQnaDao;
import com.blackswan.web.dao.oracle.OracleSelQNADao;
import com.blackswan.web.entity.SelQNA;

@WebServlet("/funding/qna")
public class QNAController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String qtitle = req.getParameter("qtitle");
		String qcont = req.getParameter("qcont");
		int id = Integer.parseInt(req.getParameter("id"));
		SelQNA qna = new SelQNA();
		qna.setContent(qcont);
		qna.setTitle(qtitle);
		qna.setFundingid(id);
		System.out.println(qna.getContent());
		System.out.println(qna.getTitle());
		System.out.println("di"+id);
		SelQnaDao sDao = new OracleSelQNADao();
		try {
			sDao.insert(qna);
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resp.sendRedirect("detail?id="+id);
	}

}
