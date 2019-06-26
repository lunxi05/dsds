package com.blackswan.web.controller.funding;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.blackswan.web.dao.FundingDao;
import com.blackswan.web.dao.FundingPriceDao;
import com.blackswan.web.dao.SellerDao;
import com.blackswan.web.dao.oracle.OracleFundingDao;
import com.blackswan.web.dao.oracle.OracleFundingPriceDao;
import com.blackswan.web.dao.oracle.OracleSellerDao;
import com.blackswan.web.entity.Funding;
import com.blackswan.web.entity.FundingPrice;
import com.blackswan.web.entity.Seller;

@WebServlet("/funding/reg2")
@MultipartConfig(location = "d:\\temp", fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024 * 5, // 5메가
		maxRequestSize = 1024 * 1024 * 5 * 5 // 5메가 5개까지
)
public class SellerRegController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

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

		int result = 0;

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
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		FundingPrice fundingprice = new FundingPrice();
		FundingPriceDao fundingPriceDao = new OracleFundingPriceDao();

		int fid;
		try {
			fid = fundingPriceDao.getLastId();
			int rPrice = Integer.parseInt(request.getParameter("rPrice"));
			String rContent = request.getParameter("rContent");

			fundingprice.setId(fid);
			fundingprice.setrPrice(rPrice);
			fundingprice.setrContent(rContent);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		try {
			result = fundingPriceDao.insert(fundingprice);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		Part filePart = request.getPart("file");
		String urlPath = "/upload";
		String path = request.getServletContext().getRealPath(urlPath);
		String fileName = filePart.getSubmittedFileName();
		String filePath = path + File.separator + fileName;

		File sameFile = new File(filePath);

		if (sameFile.exists()) {

			int n = fileName.lastIndexOf(".");
			String name = fileName.substring(0, n);
			String suffix = fileName.substring(n);

			int parenS = name.lastIndexOf("(");
			int parenE = name.lastIndexOf(")");

			String indexC = name.substring(parenS + 1, parenE);

			int indexN = Integer.parseInt(indexC);

			if (parenS == -1)
				fileName = name + "(" + 1 + ")" + suffix;
			else {
				indexN++;
				fileName = fileName.substring(0, parenS + 1) + indexN + ")" + suffix;
			}
		}

		InputStream fis = filePart.getInputStream();
		FileOutputStream fos = new FileOutputStream(filePath);

		byte[] buf = new byte[1024];
		int size = 0;

		while ((size = fis.read(buf)) != -1)
			fos.write(buf, 0, size);

		fis.close();
		fos.close();

		if (result != 1)
			response.sendRedirect("error");
		else
			response.sendRedirect("list");

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("/WEB-INF/view/funding/reg2.jsp").forward(request, response);

	}
}