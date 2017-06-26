<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="source"
		value="Java Web0程序开发范例宝典1典型模块大全0Java2实例完全自学手册1典型模块大全" />
	<b>原字符串：</b>
	<c:out value="${source }" />
	<br>
	<b>分割后的字符串：</b>
	<br>
	<c:forTokens items="${source }" delims="012" var="result">
	${result }<br>
	</c:forTokens>
</body>
</html>