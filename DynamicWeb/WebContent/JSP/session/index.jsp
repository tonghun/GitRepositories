<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>演示session设置的属性的有效范围</title>
<%
	session.setAttribute("attr02", "attr02之值");
%>
</head>
<body>
	获取在session作用域内设置的属性：
	<br> ${sessionScope.attr02 }
</body>
</html>