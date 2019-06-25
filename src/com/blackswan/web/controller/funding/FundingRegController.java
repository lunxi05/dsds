package com.blackswan.web.controller.funding;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.blackswan.web.dao.FundingDao;
import com.blackswan.web.dao.FundingPriceDao;
import com.blackswan.web.dao.SellerDao;
import com.blackswan.web.dao.oracle.OracleFundingDao;
import com.blackswan.web.dao.oracle.OracleFundingPriceDao;
import com.blackswan.web.dao.oracle.OracleSellerDao;
import com.blackswan.web.entity.Funding;
import com.blackswan.web.entity.FundingPrice;
import com.blackswan.web.entity.Seller;

@WebServlet("/funding/reg")
public class FundingRegController extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdate_ = new SimpleDateFormat("yyyy-mm-dd");
		SimpleDateFormat edate_ = new SimpleDateFormat("yyyy-mm-dd");
		
		//int fid = Integer.parseInt(request.getParameter("fid"));
		int memberId = Integer.parseInt(request.getParameter("memberId"));
		int categoryId = Integer.parseInt(request.getParameter("categoryId"));
		String title = request.getParameter("title");
		int tAmount = Integer.parseInt(request.getParameter("tAmount"));
		String introImg = request.getParameter("introImg");
		
		String sdate = request.getParameter("sdate");
		String edate = request.getParameter("edate");
		int state = Integer.parseInt(request.getParameter("state"));
		String content = request.getParameter("content");
		
		Funding funding = new Funding();
		//funding.setId(fid);
		funding.setMemberId(memberId);
		funding.setCategoryId(categoryId);
		funding.setTitle(title);
		funding.settAmount(tAmount);
		funding.setIntroImg(introImg);
		funding.setSdate(sdate);
		funding.setEdate(edate);
		funding.setState(state);
		funding.setContent(content);
		
		int result =0;
		
		FundingDao fundingDao = new OracleFundingDao();
		
		
		
		try {
			result = fundingDao.insert(funding);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
		
			
		int id = Integer.parseInt(request.getParameter("memberId"));
		int companyTel = Integer.parseInt(request.getParameter("companyTel"));
		String companyEmail = request.getParameter("companyEmail");
		String companyName = request.getParameter("companyName");
		String companyImg = request.getParameter("companyImg");
		String companyWeb = request.getParameter("companyWeb");
		int companyComi = Integer.parseInt(request.getParameter("companyComi"));
		int companyRegNum = Integer.parseInt(request.getParameter("companyRegNum"));
		String companyReg = request.getParameter("companyReg");
		String companyPass = request.getParameter("companyPass");
		String companyBoss = request.getParameter("companyBoss");
		String companyBossEmail = request.getParameter("companyBossEmail");
		
		
		
		Seller seller = new Seller();
		
		seller.setId(id);
		seller.setCompanyTel(companyTel);
		seller.setCompanyEmail(companyEmail);
		seller.setCompanyName(companyName);
		seller.setCompanyImg(companyImg);
		seller.setCompanyWeb(companyWeb);
		seller.setCompanyComi(companyComi);
		seller.setCompanyRegNum(companyRegNum);
		seller.setCompanyReg(companyReg);
		seller.setCompanyPass(companyPass);
		seller.setCompanyBoss(companyBoss);
		seller.setCompanyBossEmail(companyBossEmail);
		
		SellerDao sellerDao = new OracleSellerDao();
		
		try {
			result = sellerDao.insert(seller);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int id = Integer.parseInt(request.getParameter(""));
		int rPrice = Integer.parseInt(request.getParameter("rPrice"));
		String rContent = request.getParameter("rContent");

		FundingPrice fundingprice = new FundingPrice();
		
		fundingprice.setId(id);
		fundingprice.setrPrice(rPrice);
		fundingprice.setrContent(rContent);
		
		FundingPriceDao fundingPriceDao = new OracleFundingPriceDao();
		
		try {
			result = fundingPriceDao.insert(fundingprice);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(result != 1)
			response.sendRedirect("error");
		else
			response.sendRedirect("list");
		 
		
		
		
		
	}

	

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/WEB-INF/view/funding/reg.jsp").forward(request, response);
	}
}