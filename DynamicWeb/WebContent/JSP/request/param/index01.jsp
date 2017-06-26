<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%--重定向，时间以秒为单位 --%>
<%--<meta http-equiv="refresh" content="3;url=index02.jsp">--%>
<title>第一个页面</title>
</head>
<body>
	这是第一个页面！
	<br>
	<%
		request.setAttribute("param01", "来自index01的param01的值");
	%>
	<jsp:forward page="index02.jsp" />
</body>
</html>