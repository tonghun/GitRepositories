<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>第一个页面</title>
</head>
<body>
	<%
		request.setAttribute("param02", "来自index02的param02的值");
	%>
	这是第二个页面！
	<br> 从第一个页面获取的属性param01的值：${requestScope.param01 }
	<br>
	<jsp:forward page="index03.jsp" />
</body>
</html>