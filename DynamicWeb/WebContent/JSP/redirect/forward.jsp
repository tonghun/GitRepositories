<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>转发</title>
</head>
<body>
	<%!private int count;%>
	<%
		System.out.println("转发----" + count++);
	%>
	<jsp:forward page="/JSP/redirect/end.html" />
</body>
</html>