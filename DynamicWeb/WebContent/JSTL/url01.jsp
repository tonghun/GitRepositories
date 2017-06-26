<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>应用&lt;c:url&gt;生成带参数的URL地址</title>
</head>
<body>
	<c:url var="path" value="register.jsp" scope="page">
		<c:param name="user" value="张三" />
		<c:param name="email" value="122@qq.com" />
	</c:url>
	<a href="${path }">提交注册</a>
</body>
</html>