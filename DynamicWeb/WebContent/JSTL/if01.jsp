<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>根据是否登录显示不同的内容</title>
</head>
<body>
	<c:if var="result" test="${empty param.name }">
		<form action="" method="post" name="form01">
			用户名：<input name="name" type="text"> <br> <input
				type="submit" value="登录">
		</form>
	</c:if>
	<c:if test="${!result }">欢迎【${param.name }】登录</c:if>
</body>
</html>