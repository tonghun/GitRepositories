package com.filter.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/thirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// response.setContentType("text/html;charset=UTF-8");
		Object value = request.getAttribute("key");
		System.out.println("value=" + value);

		HttpSession session = request.getSession();
		System.out.println("sessionKey=" + session.getAttribute("sessionKey"));

		System.out.println("ThirdServlet-----响应前");
		PrintWriter out = response.getWriter();
		out.write("ThirdServlet响应<br>");
		System.out.println("ThirdServlet-----响应后");
		/*request.getRequestDispatcher("/index.jsp").forward(request, response);
		response.sendRedirect(request.getContextPath() + "/index.jsp");*/
	}

}
