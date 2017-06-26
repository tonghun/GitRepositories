<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String content = request.getParameter("param");
	if (content.equals("123"))
		out.println("通过");
	else
		out.println("未通过");
%>