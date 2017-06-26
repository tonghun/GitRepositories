<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="author" content="zuozhe">
<title>比较request.getProtocol()与request.getScheme()</title>
<%
	String relativePath = request.getContextPath();
	String basePath = request.getScheme() + ":" + "//" + request.getServerName() + ":" + request.getServerPort()
			+ relativePath + "/";
	System.out.println(basePath);
%>
</head>
<body>
	request.getProtocol()获得通信协议的具体类型:
	<br>${pageContext.request.protocol }
	<br>request.getScheme()获取协议名称，通常是相对于其他协议的名称，比较粗糙:
	<br>${pageContext.request.scheme }
</body>
</html>