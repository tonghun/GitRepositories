<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>application保存了所用应用程序的公有数据，服务器启动时自动创建，服务器停止时销毁</title>
<%
	application.setAttribute("app01", "the value of app01");
	session.setAttribute("sess01", "the value of sess01");
%>
</head>
<body>
	获取application设置的属性app01：
	<br> ${ app01}
	<br>获取session设置的属性sess01
	<br>${sess01 }
</body>
</html>