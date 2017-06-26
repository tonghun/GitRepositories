<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	// 	String content = request.getParameter("content");
	String s = request.getAttribute("id").toString();
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>target.jsp</title>
</head>
<body>
	<%-- 	访问请求参数:<%=content%> --%>
	访问请求参数:<%=s%>
</body>
</html>