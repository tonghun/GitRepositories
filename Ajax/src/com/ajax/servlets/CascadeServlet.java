package com.ajax.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ajax.beans.Region;

@WebServlet("/cascadeServlet")
public class CascadeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String province = request.getParameter("province");
		Map<String, String> map = Region.getRegion();
		String cities = map.get(province);
		PrintWriter out = response.getWriter();
		out.write(cities);
	}

}
