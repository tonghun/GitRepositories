<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>演示访问环境信息的隐含对象paramValues的用法</title>
</head>
<body>
	<c:forEach items="${paramValues.name }" var="name">${name }<br>
	</c:forEach>
	<h3>当一个请求参数对应多个值时，采用paramValues接收数据，采用jstl标签遍历</h3>
</body>
</html>