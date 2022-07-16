package com.pankx.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pankx.po.Student;

/**
 * Servlet implementation class UpdateCVServlet
 */
@WebServlet("/UpdateCVServlet")
public class UpdateCVServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCVServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// 设置编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		// 从数据库中查出来修改的数据
		// 此例暂时写死
		 
		 Student student = new Student();
		 student.setId(12);
		 student.setUser("xiaomin");
		 student.setPassword("1234");
		 student.setRealName("小海");
		 student.setSex("2");
		 student.setMajor("1");
		 student.setPhone("12321212123");
		 student.setIntro("你好");
		 
		 request.setAttribute("Student", student);
		 
		 request.getRequestDispatcher("cvUpdate.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// 设置编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		// 获取用户id
		String id = request.getParameter("id");
		// 通过id从数据库查询出student数据，此例暂不做数据库查询
		Student s = new Student();
		s.setId(Integer.parseInt(id));
		s.setRealName(request.getParameter("name"));
		s.setSex(request.getParameter("sex"));
		s.setMajor(request.getParameter("major"));
		s.setPhone(request.getParameter("phone"));
		s.setIntro(request.getParameter("intro"));
		// 调试
		response.getWriter().println(s);
		// 保存到数据
		// 跳转页面
		
		
	}

}
