<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:useBean id="userInfo" class="jstl.UserInfo"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	在指定范围内定义变量：
	<c:set var="username" value="username的值" scope="session" />
	<br> 获取在指定范围内保存的属性值,使用EL： ${username }
	<br>使用c:out:
	<c:out value="${username }" />
	<br>使用session:<%
		out.println(session.getAttribute("username"));
	%>
	<br>为对象中的属性赋值：
	<c:set value="对象中属性的值" target="${userInfo }" property="name" />
	<br>取得对象中属性的值：EL方式：${userInfo.name };c:out方式：
	<c:out value="${userInfo.name }" />
	<br>
<%-- 	<c:set value="直接指定值" /> --%>
	<br>
</body>
</html>