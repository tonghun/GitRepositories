<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	param获取请求参数的值：${param.text01 }
	<br> paramValues获取同名请求参数的多个值：${paramValues.check[0] }/${paramValues.check[1] }/${paramValues.check[2] }
	<br>initParam获取初始化参数的值：${initParam.name }
	<br>获取cookie对象：${cookie.cookieName }
	<br> 获取cookie对象的值：${cookie.cookieName.value }
</body>
</html>