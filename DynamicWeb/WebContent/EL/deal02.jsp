<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>the result of landing</title>
</head>
<body>
	name:${empty param.name?"用户名为空":param.name }
	<br> password:${empty param.password?"密码为空":param.password }
</body>
</html>