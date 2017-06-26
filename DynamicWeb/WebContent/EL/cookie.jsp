<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>使用EL访问cookie对象</title>
</head>
<body>
	<%
		Cookie cookie = new Cookie("key01", "the value of value");
		response.addCookie(cookie);
	%>
	访问cookie对象：
	<br>${cookie.key01.value }
</body>
</html>