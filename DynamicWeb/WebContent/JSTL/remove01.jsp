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
	<ul>
		<li>定义request范围内的变量username:</li>
		<c:set var="username" value="明日科技" scope="request" />
		<c:out value="${username }" />
		<li>移除request范围内的变量username</li>
		<!--var用于指定要移除的变量名 -->
		<c:remove var="username" scope="request" />
		<c:out value="${username }" default="为空" />
	</ul>
</body>
</html>