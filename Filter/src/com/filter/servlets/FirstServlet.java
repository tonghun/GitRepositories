package com.filter.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		System.out.println("FirstServlet----include前");
		out.write("FirstServlet----include前<br>");

		System.out.println("转发前request=" + request);

		// 采用forward时将请求转发给下一个资源处理，同时将响应权交给下一个资源，自身不能做出响应，out.write方法不起作用
		request.getRequestDispatcher("/thirdServlet").forward(request, response);

		System.out.println("转发后request=" + request);

		request.setAttribute("key", "value");

		HttpSession session = request.getSession();
		session.setAttribute("sessionKey", "sessionValue");

		out.write("FirstServlet----include后<br>");
		System.out.println("FirstServlet----include后");

		// response.sendRedirect(request.getContextPath() + "/index.jsp");
	}

}
