<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="user" class="el.User"></jsp:useBean>
<jsp:setProperty property="name" name="user" value="pageScope" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
	request.setAttribute("requestValue", "request");
	session.setAttribute("sessionValue", "session");
	application.setAttribute("applicationValue", "application");
%>
</head>
<body>
	page范围内的属性值：${pageScope.user.name}
	<br>session范围内的属性值：${sessionScope.sessionValue }
	<br>request范围内的属性值：${requestScope.requestValue }
	<br>application范围内的属性值：${applicationScope.applicationValue }
</body>
</html>