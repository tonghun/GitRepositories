<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");
	String author = (String) request.getParameter("author");
	String content = (String) request.getParameter("content");
	if (author != "" && content != "") {
		String message01 = "[" + author + "]说：" + content + "<br>";
		if (session.getAttribute("message01") != null) {
			message01 += (String) session.getAttribute("message01");
		}
		session.setAttribute("message01", message01);
	}
	response.sendRedirect("index.jsp");
%>