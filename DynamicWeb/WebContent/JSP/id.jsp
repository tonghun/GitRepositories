<%@ page language="java" contentType="text/html; charset=GB18030"
	pageEncoding="GB18030"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>演示脚本标识</title>
</head>
<body>
	<%!String s01;//表达式标识：用来定义全局变量或者函数，服务器关闭之前一直有效%>
	<%
		String s02 = "此处演示";
		s01 = "片段标识";
	%>
	<%=s02 + s01%>
</body>
</html>