<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="shortcut icon"href="images/icon.jpg">
<title>登陆页面</title>
</head>
<body>
	<form
		action="${pageContext.request.contextPath }/loginServlet?uri=${param.uri}"
		method="post">
		用户名:<input type="text" name="name"><br>
		密&nbsp;码&nbsp;:<input type="text" name="password"><br>
		<input type="submit" value="登陆">
	</form>
</body>
</html>