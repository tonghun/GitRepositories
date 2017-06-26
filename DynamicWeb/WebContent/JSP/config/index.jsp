<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>cofig对象用于获取服务器的配置信息，通常用在Servlet的init()方法中获取该Servlet的初始化参数</title>
</head>
<body>
	<!-- 只能用在Servlet中 -->
	<%=config.getInitParameter("name")%>
	<br>
	<%=application.getInitParameter("name")%>
</body>
</html>