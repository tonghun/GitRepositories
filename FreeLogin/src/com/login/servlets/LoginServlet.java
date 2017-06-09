package com.login.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String uri = request.getParameter("uri");
		/*System.out.println("name=" + name);
		System.out.println("password=" + password == null);
		System.out.println("uri=" + uri);*/

		if (name.equals("chen") & password.equals("123")) {
			HttpSession session = request.getSession();
			session.setAttribute("login", "logined");
			if (uri != "")
				response.sendRedirect(uri);
			else
				out.write("登陆成功，欢迎");
		} else {
			out.write("请重新登陆");
		}

	}

}
