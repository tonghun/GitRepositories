<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>使用El访问数组与List集合</title>
<%
	String[] arr = { "中国", "美国", "日本" };
	session.setAttribute("arr", arr);
%>
</head>
<body>

</body>
</html>