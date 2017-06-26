<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>使用request获取客户端信息</title>
</head>
<body>
	HTTP协议的文件头信息：<%=request.getHeader("user-agent")%>
	<br> 客户端向服务器传输数据的方式：<%=request.getMethod()%>
	<br> HTTP的协议：<%=request.getProtocol()%><br> 发出请求的文件的地址：<%=request.getRequestURI()%>
	<br> 发出请求的文件的地址：<%=request.getRequestURL()%>
	<br> 发出请求的文件的绝对地址：<%=request.getServletContext().getRealPath("clientInfo")%>
	<br> 客户端IP:<%=request.getRemoteAddr()%>
	<br> 客户端主机名：<%=request.getRemoteHost()%>
	<br> 服务器名字：<%=request.getServerName()%>
	<br> 服务器端口：<%=request.getServerPort()%>
	<br> 服务器所请求的脚本文件的路径：<%=request.getServletPath()%>
	<br>
</body>
</html>