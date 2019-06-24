package com.blackswan.web.controller.qna;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.blackswan.web.dao.QnaDao;
import com.blackswan.web.dao.oracle.OracleQnaDao;
import com.blackswan.web.entity.Qna;

@WebServlet("/qna/reg")
public class QnaRegController extends HttpServlet {

	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
req.getRequestDispatcher("/WEB-INF/view/qna/reg.jsp");
}

@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	int division = Integer.parseInt(req.getParameter("division"));
	String title = req.getParameter("title");
	String content = req.getParameter("content");
	
	Qna qna = new Qna();
	qna.setDivision(division);
	qna.setTitle(title);
	qna.setContent(content);
	
	QnaDao qnaDao = new OracleQnaDao();
	
	int result=0;
	
	try {
		result = qnaDao.insert(qna);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	catch (SQLException e) {
	e.printStackTrace();
	}
	
	if(result !=1)
		resp.sendRedirect("error");
	else
		resp.sendRedirect("list");
	
	}
}
