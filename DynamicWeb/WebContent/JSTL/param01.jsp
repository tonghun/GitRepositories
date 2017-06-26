<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>应用&lt;c:param&gt;传递参数</title>
<%
	request.setCharacterEncoding("ISO-8859-1");
	response.setCharacterEncoding("UTF-8");
%>
</head>
<body>
	<c:redirect url="param01-01.jsp">
		<c:param name="param01" value="123好" />
	</c:redirect>
</body>
</html>