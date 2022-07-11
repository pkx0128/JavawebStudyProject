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
 * Servlet implementation class AddCVServlet
 */
@WebServlet("/AddCVServlet")
public class AddCVServlet extends HttpServlet {
	Map<String,Student> std = new HashMap<String,Student>();
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCVServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("UTF-8");
		
		String realname = request.getParameter("name");
		String sex = request.getParameter("sex");
		String major = request.getParameter("major");
		String phone = request.getParameter("phone");
		String intro = request.getParameter("intro");
		
		Student s = new Student();
		s.setRealName(realname);
		s.setSex(sex);
		s.setMajor(major);
		s.setPhone(phone);
		s.setIntro(intro);
		std.put(realname, s);
		//TODO暂时不进行数据库处理
		
		response.getWriter().print(std.get(realname));
	}

}
