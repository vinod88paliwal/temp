package com.thejavageek;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
public class LoginServlet extends HttpServlet {
 
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}
 
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
 
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		HttpSession session = null;
		RequestDispatcher dispatcher = null;
		
		if (("Vinod".equalsIgnoreCase(username) && "Paliwal".equals(password))) {
			
			session = request.getSession();
			session.setAttribute("username", username);
			dispatcher = request.getRequestDispatcher("welcome.jsp");
		
		} else {
			dispatcher = request.getRequestDispatcher("failure.jsp");
		}
		
		dispatcher.forward(request, response);
	}
 
}