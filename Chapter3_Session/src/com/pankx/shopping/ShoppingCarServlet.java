package com.pankx.shopping;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShoppingCarServlet
 */
@WebServlet("/ShoppingCarServlet")
public class ShoppingCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShoppingCarServlet() {
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
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		HttpSession session = request.getSession();
//		session.removeAttribute("shoppingCar");
		Map<String,Integer> car = (Map<String,Integer>)session.getAttribute("shoppingCar");
		String[] books = request.getParameterValues("book");
		if(car == null) {
			car = new HashMap<String,Integer>();
		}
		if(books != null && books.length > 0) {
			for(String book : books) {
				if(car.get(book) == null) {
					car.put(book, 1);
				}else {
					car.put(book, car.get(book)+1);
				}
			}
			session.setAttribute("shoppingCar", car);
		}
		//response.getWriter().print(session.getAttribute("shoppingCar"));
		response.sendRedirect("ShoppingCarListServlet");
	}

}
