<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>java代码可以控制页面的显示</title>
</head>
<body>
	<%
		int a = 2;
		if (a == 1) {
	%>
	<input type="button" name="button01" value="a==1" />
	<%
		} else {
	%>
	<input type="button" name="button02" value="a!=1" />
	<%
		}
	%>
</body>
</html>