<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2 style="color: red;">这是来自被包含文件的内容</h2>
	显示包含文件传来的参数：
	<input type="text" value="${param.param01 }" size="40" readonly>
	<br> 接收来自包含文件请求转发来的参数:${param02}
</body>
</html>