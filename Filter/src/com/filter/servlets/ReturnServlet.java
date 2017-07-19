package com.filter.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/returnServlet")
public class ReturnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		session.setAttribute("name", "servlet_name");
		PrintWriter out = response.getWriter();
		out.write("servlet响应内容<br>");
		/*response.sendRedirect(request.getContextPath() + "/return/index.jsp");*/
	}

}
