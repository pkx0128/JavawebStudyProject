package com.pankx.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckUserServlet
 */
@WebServlet("/CheckUserServlet")
public class CheckUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for(int i=0; i<cookies.length; i++) {
				Cookie cookie = cookies[i];
				if(cookie.getName().equals("username")) {
					response.sendRedirect("welcome.jsp");
					return;
				}
			}
			response.sendRedirect("login.jsp");
		}else {
			response.sendRedirect("login.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user = request.getParameter("username");
		String password = request.getParameter("password");
		String remember = request.getParameter("remember");
		if(user !=null && password != null) {
			//TODO 暂时不对用户名密码做验证
			if(remember.equals("1")) {
				Cookie cookie = new Cookie("username",user);
				response.addCookie(cookie);
			}
			response.sendRedirect("welcome.jsp");
		}
	}

}
