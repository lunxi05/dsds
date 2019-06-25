package com.blackswan.web.filter;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.blackswan.web.dao.MemberDao;
import com.blackswan.web.dao.oracle.OracleMemberDao;



@WebFilter(
		urlPatterns= {"/*"},
		initParams= {@WebInitParam(name="encoding", value="UTF-8")}
		)
public class CharacterEncodingFilter implements Filter{
	
	private String encoding = "UTF-8";

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		request.setCharacterEncoding("UTF-8");
		
		HttpServletRequest httpreq = (HttpServletRequest) request;
		
		HttpSession session = httpreq.getSession();
		if (session.getAttribute("ssid") != null) {
			int sId = (int) session.getAttribute("ssid");

			MemberDao memberDao = new OracleMemberDao();

			try {
				if (sId != 0)
					httpreq.setAttribute("hmember", memberDao.get(sId));

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		
		
		chain.doFilter(request, response);
		
	}
	
//	@Override
//	public void init(FilterConfig filterConfig) throws ServletException {
//		String encoding = filterConfig.getInitParameter("encoding");
//		
//		if(encoding != null && !encoding.equals(""))
//			this.encoding = encoding;
//	}

}
