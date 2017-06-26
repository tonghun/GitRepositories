<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	request.setAttribute("id", "通过转发传递数据");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>使用request对象获取请求参数</title>
</head>
<body>
	<!-- 	<a href="target.jsp?content=2">转发请求</a> -->
	<jsp:forward page="target.jsp" />
</body>
</html>