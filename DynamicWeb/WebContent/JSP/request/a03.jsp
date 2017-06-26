<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>解决中文乱码</title>
</head>
<body>
	<a href="b03.jsp?content=请求参数内容">发出请求</a>
	<br>
	<b style="font-size: 20px; color: red;">中文乱码产生的原因：</b>request请求采用ISO-8895-1编码方式，与显示页面的编码方式不同，产生冲突。
	<br>
	<b style="font-size: 20px; color: red;">解决方法：</b>显示页面获的请求参数以后对其重新编码，重新编码采用String的构造方法。
</body>
</html>