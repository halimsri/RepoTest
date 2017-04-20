//package com.fdmgroup.filter;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
///**
// * Servlet Filter implementation class AuthenticationFilter
// */
///*@WebFilter("/*")*/
//public class AuthenticationFilter implements Filter {
//	List<String> excludedUrls = new ArrayList<String>();
//	
//    
//    public AuthenticationFilter() {
//        // TODO Auto-generated constructor stub
//    }
//
//    public void init(FilterConfig fConfig) throws ServletException {
//    	//excludedUrls.add("/home");
//    	excludedUrls.add("login.jsp");
//    	excludedUrls.add("/processLogin ");
//    	
//	}
//
//	public void destroy() {
//		// TODO Auto-generated method stub
//	}
//
//	
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//		HttpServletRequest httpReq = (HttpServletRequest)request;
//		//dont wnt to create new session, so should be false
//		HttpSession session = httpReq.getSession(false);
//		//if session null -- first time login, if not attribute user, and its the excluded servlet, then forward
//		if((session == null || session.getAttribute("user") == null) && !excludedUrls.contains(httpReq.getServletPath())){
//			RequestDispatcher rd = httpReq.getRequestDispatcher("login.jsp");
//			rd.forward(request, response);
//		}
//		chain.doFilter(request, response);
//	}
//
//	
//	
//}
