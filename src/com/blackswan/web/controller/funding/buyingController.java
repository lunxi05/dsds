package com.blackswan.web.controller.funding;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.blackswan.web.dao.BuyingDao;
import com.blackswan.web.dao.FundingPriceDao;
import com.blackswan.web.dao.MemberDao;
import com.blackswan.web.dao.oracle.OracleBuyingDao;
import com.blackswan.web.dao.oracle.OracleFundingPriceDao;
import com.blackswan.web.dao.oracle.OracleMemberDao;
import com.blackswan.web.entity.Member;

@WebServlet("/funding/buying")
public class buyingController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		FundingPriceDao fundingPrice = new OracleFundingPriceDao();
		
		int id = 63;
		String id_ = request.getParameter("id");
		
		if(id_ != null && !id_.equals(""))
			id= Integer.parseInt(id_);
		
		try {
			request.setAttribute("fpr", fundingPrice.getList(id));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		request.getRequestDispatcher("/WEB-INF/view/funding/buying.jsp").forward(request, response);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		int phone = Integer.parseInt(request.getParameter("phone"));
		int adressNum = Integer.parseInt(request.getParameter("adress_num"));
		String adress = request.getParameter("adress");
		
		
		Member member = new Member();
		member.setName(name);
		member.setPhone(phone);
		member.setAddressNum(adressNum);
		member.setAddress(adress);

		MemberDao memberDao = new OracleMemberDao();
		
		int result = 0;
		
		try {
			result = buyingDao.insert(buying);
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		if(result != 1)
			response.sendRedirect("/blackswan2/error");
		else
			response.sendRedirect("/blackswan2/index");
		
		
	}

}
