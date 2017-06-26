<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%
	String name = request.getAttribute("name").toString();
	String name02 = new String(name.getBytes("ISO-8859-1"), "UTF-8");
	request.setAttribute("name", name02);
%>
</head>
<body>
	<b>输出结果：</b>
	<br> 姓名：${name}
	<br> 密码：${password }
</body>
</html>