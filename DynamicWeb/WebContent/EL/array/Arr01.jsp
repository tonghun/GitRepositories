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
		String[] arr = { "中国", "美国", "英国" };
		request.setAttribute("country", arr);
		for (int i = 0; i < arr.length; i++) {
			request.setAttribute("index", i);
	%>
	${index}: ${country[index] }
	<br>
	<%
		}
	%>
</body>
</html>