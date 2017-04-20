package com.fdmgroup.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.fdmgroup.dao.UserDao;
import com.fdmgroup.model.User;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/processLogin")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the username and password from name in the jsp file
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		UserDao userDao = UserDao.getInstance();
		User user = userDao.findByUsername(username);
		if(user != null && user.getPassword().equals(password)){
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			//session.setMaxInactiveInterval(300);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/welcome.jsp");
			rd.forward(request, response);
		}else{
			request.setAttribute("errorMsg", "Username/Password/Role is wrong");
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/login.jsp");
			rd.forward(request, response);
		}
	}

}
