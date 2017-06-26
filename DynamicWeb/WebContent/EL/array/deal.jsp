<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String[] arr = (String[]) session.getAttribute("arr");//java代码块中的全局变量只能在java代码块中直接使用，JSP页面其他部分只能通过属性访问
		for (int i = 0; i < arr.length; i++) {
			request.setAttribute("index", i);
	%>
	${index }:${sessionScope.arr[index] }
	<br>
	<%
		}
	%>
</body>
</html>