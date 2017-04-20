package com.fdmgroup.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class ShowDayServlet
 */
@WebServlet("/showDay")
public class ShowDayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<String> countries = new ArrayList<>();
		countries.add("Canada");
		countries.add("USA");
		countries.add("japan");
		countries.add("peru");
		
		//request.setAttribute("countries", countries);
		//created session, session doesnt require forward, so you can keep
			HttpSession session = request.getSession();
			session.setAttribute("countries", countries);
			//session.removeAttribute("countries");
		//same like closing the browser
			//session.invalidate();
		//will invalidate after 5 minutes
		// if have negative value the session will be inactive when you close the browser
		//0 meaans kill it
			//session.setMaxInactiveInterval(300);
		
		
		
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		if(day == 1){
			day = 7;
		}else{
			day--;
		}
		//need to send this day to JSP. dont want to build view in this
		//want to send data and JSP will display it
		//attribute, because it has 5 scopes, this is request scope
		//everything here is case sensitve
		//this is autoboxing, 
		request.setAttribute("dayOfTheWeek", day);
		//how to send this to the particular jsp, need to direct this
		//2 ways:
		//forward: redirect:
		RequestDispatcher rd = request.getRequestDispatcher("displayDay.jsp");
		rd.forward(request, response);
		
		/*response.sendRedirect("displayDay.jsp");*/
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
