package com.pankx.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pankx.po.Student;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	
	Map <String ,Student> database = new HashMap<String,Student>();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String method = request.getParameter("method");
		String username = request.getParameter("username");
		String pwd = request.getParameter("password");
		Student student = new Student();
		if("reg".equals(method)) {			
			if(request.getParameter("username") != null) {
				student.setId(1);
				student.setUser(username);
				student.setPassword(pwd);		
				database.put(username,student);
				request.getSession().setAttribute("username", username);
//			response.getWriter().print("注册成功");
				response.sendRedirect("regSuccess.jsp");
			}else{
				response.getWriter().print("用户名不能为空");
			}
		}else if("login".equals(method)) {
			if(username != null && pwd != null) {
				if(username.equals(database.get(username).getUser()) && pwd.equals(database.get(username).getPassword()) ) {
				
					request.getSession().setAttribute("username", username);
					response.sendRedirect("loginSuccess.jsp");
				}else {
					response.getWriter().print("用户名或密码错误！！");
					response.sendRedirect("login.jsp");
				}
				
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
