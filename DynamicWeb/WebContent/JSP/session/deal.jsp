<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	session的作用范围分为两个方面：
	<br>一时间范围，从浏览器与服务器建立起连接开始，直到浏览器关闭；
	<br>二空间范围，session会话代表的是浏览器与服务器之间的关系，不是单个页面与服务器之间的关系，
	<br>所以即使创建session的页面关闭，只要浏览器与服务器之间的联系存在，sesssion依然有效。
	<br>
	<p>
		此处演示的是通过session获取无关页面设置的属性： <br> ${sessionScope.attr02 }
</body>
</html>