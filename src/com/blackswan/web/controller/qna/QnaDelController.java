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

@WebServlet("/qna/del")
public class QnaDelController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		QnaDao qnaDao = new OracleQnaDao();

		Integer id = Integer.parseInt(req.getParameter("id"));

		try {
			qnaDao.delete(id);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		resp.sendRedirect("list");
	}

}
